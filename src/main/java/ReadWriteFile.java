import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import tabels.Hotels;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadWriteFile {

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
    public void dbToJson(){

    }
    //From Obj to DB
    public void dbToXml(){

    }
}
