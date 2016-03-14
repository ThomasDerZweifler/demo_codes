package cf;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by abhishekupadhyay on 2016/03/05.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {


    private final CfService cfService;

    @Autowired
    CustomUserDetailsService(CfService cfService){
        this.cfService=cfService;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        JSONObject jsonObject=null;
        try {
            jsonObject = cfService.findByEmail(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jsonObject == null) {
            throw new UsernameNotFoundException(String.format("User %s does not exist!", username));
        }
        System.out.println("done successfully");
        if(jsonObject.getString("role").equals("ROLE_USER"))
        return  new org.springframework.security.core.userdetails.User(
                jsonObject.getString("username"),jsonObject.getString("password"),true,true,
                true,true,
                AuthorityUtils.createAuthorityList("ROLE_USER", "write")
        );
        else
        {
            return  new org.springframework.security.core.userdetails.User(
                    jsonObject.getString("username"),jsonObject.getString("password"),true,true,
                    true,true,
                    AuthorityUtils.createAuthorityList("ROLE_ADMIN", "write")
            );
        }

    }
}
