class Solution {
    public String defangIPaddr(String address) {
        // for(int i=0;i<address.length();i++){
        //     if(address[i]=="."){
        //         address[i]=",";
        //     }
        // }
        return address.replace(".","[.]");
    }
}