package cf;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhishek Upadhyay on 2/16/2016.
 */
public class Try {
    public static void main(String args[]){
        try{
            CfService cfs = new MongoCfService();
            /*UserName name1 = new UserName("Mr.", "Armaan", "K.", "Marwaha");
            UserName name2 = new UserName("Mr.", "Harsh", "K.", "Marwaha");
            UserAddress Address1 = new UserAddress(name1, "A-204", "LJaipuri", "Ghaziabad", "201014", "9670976720");
            UserAddress Address2 = new UserAddress(name2, "A-204", "LJaipuri", "Ghaziabad", "201014", "9650909291");
            UserPhone phone = new UserPhone("+91", "9670976720");
            Date dob = new Date("13", "03", "1994");
            Date registrationDate = new Date("1", "11", "2004");
            Date lastVisit = new Date("3", "08", "2014");
            List<UserAddress> addresses = new ArrayList<UserAddress>();
            addresses.add(Address1);addresses.add(Address2);
            List<String> orders = new ArrayList<String>();
            orders.add("order1");orders.add("order2");orders.add("order3");
            User me = new User(name1, dob, registrationDate, lastVisit, phone, addresses, orders, "email@gmail.com", "password", "cartId1123104");
            cfs.addToDB(me.toDBObject());*/
            DBObject query = new BasicDBObject("_id", new ObjectId("56c47a36c593fe949790e102"));
            WriteResult wr = cfs.updatePassword(query, "pass123");
            System.out.println(wr.toString());
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
