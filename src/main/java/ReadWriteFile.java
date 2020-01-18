import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import tabels.Hotels;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadWriteFile {

    ObjectMapper mapper = new ObjectMapper();

    //From JSON to Obj
    public void jsonToObj(ObjectMapper jsonMapper) throws IOException {
        List<Hotels> deserializedObjects = jsonMapper.readValue(new File("C:\\Users\\kamil\\Desktop\\PIII\\FIle\\obj.json"),
                new TypeReference<List<Hotels>>() {

                }); {
                }
    }
    //From XML to Obj
    public void xmlToObj(File filex){

    }
    //From Obj to JSON
    /*public void dbToJson(List<Hotels> allhotelsList){
        for(Hotels h :allhotelsList){
            try {
                mapper.writeValue(new File("C:\\Users\\kamil\\Desktop\\PIII\\FIle\\obj.json"), h);
            }catch (JsonGenerationException e){
                e.printStackTrace();
            }catch (JsonMappingException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }*/
    //From Obj to DB
    public void dbToXml(){

    }
}
