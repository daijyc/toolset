import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

public class GetCredential {
    public static void main(String[] args) throws IOException {
        Configuration.addDefaultResource("hive-site.xml");
        Configuration conf = new Configuration();
        String pwd = new String(conf.getPassword("javax.jdo.option.ConnectionPassword"));
        System.out.println(pwd);
    }
}
