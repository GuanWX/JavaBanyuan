package club.banyuan.XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.swing.text.html.HTML;
import java.io.File;


/**
 * @author edz
 * @version 1.0
 * @date 2020/12/9 10:41 上午
 */
public class write {
    public static void main(String[] args){
        File file = new File("java-banyuan/File/info.xml");
        Document document = null;
        SAXReader saxReader = new SAXReader();
        try {
            document = saxReader.read(file);
            document.addElement("HTML");
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
