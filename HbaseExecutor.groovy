

import org.apache.hadoop.hbase.*
import org.apache.hadoop.conf.*
import org.apache.hadoop.hbase.client.*

public class HbaseExecutor {
  HBaseAdmin admin
  Configuration config
  HTable table
  Get g;
  Result result
  Scan scan
  public void init(String tablename, String row) throws IOException {
    config = HBaseConfiguration.create()
    // Create table
    admin = new HBaseAdmin(config)
    table = new HTable(config, tablename)
    byte[] row1 = row.getBytes()
    g = new Get(row1)
    Result result = table.get(g)
    System.out.println("Get: " + result);
    scan = new Scan();
//    ResultScanner scanner = table.getScanner(scan);
  //  try {
    //  for (Result scannerResult: scanner) {
//	System.out.println("Scan: " + scannerResult);
//	Clients | 465
  //    }
    //} finally {
      //scanner.close();
//    }

  }
}
//groovysh -cp "/home/samyang/hbase-0.90.6/*;/home/samyang/hbase-0.90.6/lib/*;/home/samyang/hbase-0.90.6/conf/*;."
// run crawl /bin/nutch crawl -d
//  nutch inject /someseedDir
//  nutch readdb