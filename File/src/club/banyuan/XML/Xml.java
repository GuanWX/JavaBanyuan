package club.banyuan.XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;


/**
 * @author edz
 * @version 1.0
 * @date 2020/12/9 10:11 上午
 */
public class Xml {
    public static void main(String[] args) {
        File file = new File("java-banyuan/File/info.xml");
        SAXReader reader = new SAXReader();
        Document document = null;
        try{
            //读取文件
            document= reader.read(file);
            // 找到根节点
            Element rootElement = document.getRootElement();
            System.out.println(rootElement.getName());
//            List elements = rootElement.elements();
//            for (Object element :elements) {
//                Element element1 = (Element) element;
//                Iterator iterator = element1.elementIterator();
//                while (iterator.hasNext()){
//                    Element element2 = (Element) iterator.next();
//                    System.out.println(element2.getName()+":"+element2.getText());
//                }
//
//            }
            //向跟几点中添加元素
            Element element = rootElement.addElement("student").addAttribute("ID", "4");
            element.addElement("name").setText("管文轩");
            element.addElement("age").setText("22");
            element.addElement("address").setText("栖霞区");

        } catch (DocumentException e) {
            e.printStackTrace();
        }
        try {
            //创建文件输出流
            FileOutputStream out = new FileOutputStream(file);
            // 创建格式
            OutputFormat of = OutputFormat.createPrettyPrint();
            //指定输出文件地址和格式
            XMLWriter xmlWriter = new XMLWriter(out,of);
            //输出文件内容
            xmlWriter.write(document);
            //关闭流
            out.close();
            xmlWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}