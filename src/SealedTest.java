import java.util.*;


sealed interface JSONValue permits JSONArray,JSONObject,JSONPrimitive{
    public default String type(){
        if(this instanceof JSONArray) return "array";
        else if (this instanceof JSONObject) return "object";
        else if (this instanceof JSONNumber) return "number";
        else if (this instanceof JSONString) return "string";
        else if (this instanceof JSONBoolean) return "boolean";
        else return "null";
    }
}

final class JSONArray extends ArrayList<JSONValue> implements JSONValue{}
final class JSONObject extends HashMap<String,JSONValue> implements JSONValue{
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("{");
        for (Map.Entry<String,JSONValue>entry:entrySet()){
            if(result.length()>1) result.append(",");
            result.append("\"");
            result.append(entry.getKey());
            result.append("\":");
            result.append(entry.getValue());
        }
        result.append("}");
        return  result.toString();
    }
}
sealed interface JSONPrimitive extends JSONValue
    permits JSONNumber,JSONString,JSONBoolean,JSONNull{}
final record JSONNumber(double value) implements JSONPrimitive{
    public String toString(){
        return ""+value;
    }
}
final record JSONString(String value) implements JSONPrimitive{
    public String toString(){
        return "\""+value.translateEscapes()+"\"";
    }
}

enum JSONBoolean implements JSONPrimitive{
    FALSE, TURE;
    public String toString(){
        return super.toString().toLowerCase();
    }
}
enum JSONNull implements JSONPrimitive{
    INSTANCE;
    public String toString(){
        return  "null";
    }
}
public class SealedTest {
    public static void main(String[] args) {
        JSONObject aObject = new JSONObject();
        aObject.put("name",new JSONString("Harry"));
        aObject.put("salary",new JSONNumber(90000));
        aObject.put("married", JSONBoolean.FALSE);
        JSONArray aArray = new JSONArray();
        aArray.add(new JSONNumber(13));
        aArray.add(JSONNull.INSTANCE);


        aObject.put("luckyNumber",aArray);
        System.out.println(aObject);
        System.out.println(aObject.getClass());



    }
}