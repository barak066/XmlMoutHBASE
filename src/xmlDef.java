 public class xmlDef {
		
	  public static String xmlDef[][] = new String[][]{
	       {"xmlTest", "xmlTest", "xmlTest", "xmlTest", "xmlTest", "xmlTest"},     //HBase table name
	       {"Y", "N", "N","N","N","N"},                                            //is column a key column?
	       {"cf1", "cf1","cf2","cf2","cf2","cf2"},                                 //column family
	       {"RowID", "ResponseID", "IPAddress", "Status", "StartDate", "EndDate"}, //column name in HBase
	       {"RowID", "ResponseID", "IPAddress", "Status", "StartDate", "EndDate"}, //xml tag
	       {"", "", "", "", "", ""}                                                // place holder for xml value
	       };
	 }

