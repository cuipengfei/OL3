package javaclasstojsonschema;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import pseudocode.domain.StockCard;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
    mapper.acceptJsonFormatVisitor(StockCard[].class, visitor);
    JsonSchema schema = visitor.finalSchema();
    System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema));
  }
}
