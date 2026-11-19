package models;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author jahood
 */
public class ZooKeeper extends Person {
    
    private String telephoneNo;
    private boolean isRegistered;
    //Integer-> orderId
    private HashMap<Integer, Order> orders;
    private LinkedList<String> addressess;
    
    
    //methods add , put the address to the end -> the LAST node
    public void addAddress(String addressIn){
        addressess.add(addressIn);
    }
    
    //methods add , put the address to the very first -> the FIRST node
    public void addFirstAddress(String addressIn){
        addressess.push(addressIn);       
        // or you can use other one .addFirst
        // addressess.addFirst(addressIn);
    }
    
    // method to remove specific node from list
    public void removeAddress(int nodeNumber){
        addressess.remove(nodeNumber); 
    }
    
    
    public ZooKeeper()
    {
        super();
        telephoneNo = "";
        isRegistered = false;
        orders = new HashMap();
        addressess = new LinkedList();
    }
    
    public ZooKeeper(String nameIn, String passwordIn, String emailIn, 
            Date dobIn, String telephoneNoIn, boolean isRegisteredIn)
    {
        super(nameIn, passwordIn, emailIn, dobIn);
        telephoneNo = telephoneNoIn;
        isRegistered = isRegisteredIn;
        orders = new HashMap();
        addressess = new LinkedList();
    }
    
    public ZooKeeper(String nameIn, String passwordIn, String emailIn, 
            Date dobIn, String telephoneNoIn)
    {
        super(nameIn, passwordIn, emailIn, dobIn);
        telephoneNo = telephoneNoIn;
        isRegistered = false; 
        orders = new HashMap();
        addressess = new LinkedList();
    }    
    
    //getter
    public LinkedList<String> getAddresses(){
        return addressess;
    }  
    
    //setter
    public void setAddresses(LinkedList<String> addressesIn){
        addressess = addressesIn;
    }
}
