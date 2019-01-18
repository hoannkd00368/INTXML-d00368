/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domlocate;
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 *
 * @author Nobita Nguyen
 */
public class DOMLocate {

  static public void main(String[] arg){
  try {
  BufferedReader bf = new BufferedReader(new
     InputStreamReader(System.in));
  System.out.print("Enter File name: ");
  String xmlFile = bf.readLine();
  File file = new File(xmlFile);
  if(file.exists()){
  DocumentBuilderFactory factory = 
  DocumentBuilderFactory.newInstance();
  DocumentBuilder builder = factory.newDocumentBuilder();
  Document doc = builder.parse(xmlFile);
  System.out.println(xmlFile + " is well-formed!");
  }
  else{
  System.out.print("File not found!");
  }
  }
  catch (SAXParseException e) {
  System.out.println("type" + ": " + e.getMessage()+"\n");
  System.out.println("Line " + e.getLineNumber() + " Column "
   + e.getColumnNumber());
  }
  catch (SAXException e) {
  System.err.println(e);
  System.exit(1);
  }
  catch (ParserConfigurationException e) {
  System.err.println(e);
  System.exit(1);
  }
  catch (IOException e) {
  System.err.println(e);
  System.exit(1);
  }
  }
} 
