package club.banyuan.Tool;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 1:53 下午
 */
public class Config {
    public static String BasePath;
    public static int Port;
    public static int UserCount=2;
    static {
        File file = new File("java-banyuan/Manager/config.xml");
        SAXReader reader = new SAXReader();
        try {
            final Document read = reader.read(file);
            final Element root = read.getRootElement();
            BasePath= root.elementText("basepath");
            Port = Integer.parseInt(root.elementText("port"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
