//package xcx;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author fangzhou
// * @date 2022-04-06 17:25
// */
//public class xcw {
//    public static void main(String[] args) {
//        insertNameList();
//
////        insertName();
//    }
//
//    public static void insertName() {
//        String context = "张德仿,\t18771150101\n" +
//                "郭静\t,15093956905\n" +
//                "路晓楠,\t13526169634\n" +
//                "张冬冬,\t15632957311\n" +
//                "边鑫\t,17778253593\n" +
//                "吴忠民,\t13953779677\n" +
//                "李燕\t,15998728566\n" +
//                "李成\t,13919810313\n" +
//                "李辉\t,13667379090\n" +
//                "于世文,\t15864092152\n" +
//                "石春霖,\t18852177767";
//
//        String lines[] = context.split("\\n");
//        for (int i = 0; i < lines.length; i++) {
//            String line = lines[i];
//            String result = "curl -H \"Content-Type: application/json\" -X POST -d '{\"phone\":" +",\"name\":\""  +"\", \"channelId\":\"00002\",\"channelName\":\"散户\",\"rostersType\":\"SUPER_WHITE\", \"rostersValue\":\"true\",\"operatePeopleName\":\"liufangzhou\"}' 'http://127.0.0.1:8033/api/mis/specialRoster/v1/insert';";
//            System.out.println(result);
//
//        }
//
//
//    }
//
//
//    public static void insertNameList() {
//        String context = ",15551609715\n" +
//                ",15937556237\n" +
//                ",13524128715\n" +
//                ",15110111747\n" +
//                ",15845098974\n" +
//                ",13677544852\n" +
//                ",13677544852\n" +
//                ",18301106279\n" +
//                ",18767121412\n" +
//                ",13488928301\n" +
//                ",15920371532\n" +
//                ",13677544852\n" +
//                ",13764298638\n" +
//                ",17712299860\n" +
//                ",13764298638\n" +
//                ",13910646013\n" +
//                ",15521373109\n" +
//                ",15521373109\n" +
//                ",13051303730\n" +
//                ",18993291053\n" +
//                ",15271849981\n" +
//                ",15647010436\n" +
//                ",13930350186\n" +
//                ",15847043076\n" +
//                ",18731783163\n" +
//                ",13722683120\n" +
//                ",15931702712\n" +
//                ",18267909002\n" +
//                ",15557085927\n" +
//                ",15895790827\n" +
//                ",15751883173\n" +
//                ",15895790827\n" +
//                ",18401578565\n" +
//                ",13940527312\n" +
//                ",13940527312\n" +
//                ",15313266269\n" +
//                ",13722683120\n" +
//                ",15522403626\n" +
//                ",15200017810\n" +
//                ",19802012658\n" +
//                ",18594918794\n" +
//                ",13003132132\n" +
//                ",13916991309\n" +
//                ",13691011112\n" +
//                ",13600412500\n" +
//                ",15618819319\n" +
//                ",15979705867\n" +
//                ",13655163537\n" +
//                ",15850532776\n" +
//                ",15876633818\n" +
//                ",13355415388\n" +
//                ",13218877663\n" +
//                ",15987169151\n" +
//                ",13114540826\n" +
//                ",15326867278\n" +
//                ",15880281388\n" +
//                ",18682077546\n" +
//                ",13307030299\n" +
//                ",13307030299\n" +
//                ",13105261701\n" +
//                ",13852858690\n" +
//                ",13852858690\n" +
//                ",13852858690\n" +
//                ",13132016265\n" +
//                ",18621678321\n" +
//                ",15367608680\n" +
//                ",15367608680\n" +
//                ",13212344104\n" +
//                ",15051351368\n" +
//                ",13924137218\n" +
//                ",15536213420\n" +
//                ",15002700562\n" +
//                ",15307187952\n" +
//                ",18355683218\n" +
//                ",15854448088\n" +
//                ",13840524641\n" +
//                ",13840524641\n" +
//                ",18037379527\n" +
//                ",13923372097\n" +
//                ",13923372097\n" +
//                ",13933033421\n" +
//                ",15122398205\n" +
//                ",15576583808\n" +
//                ",15127191073\n" +
//                ",13205539162\n" +
//                ",13205539162\n" +
//                ",13367612529\n" +
//                ",13367612529\n" +
//                ",19148922245\n" +
//                ",13967618796\n" +
//                ",18052105010\n" +
//                ",13054805734\n" +
//                ",15079493476\n" +
//                ",18519192236\n" +
//                ",18332215637\n" +
//                ",18231852921\n" +
//                ",13526708509\n" +
//                ",15158993415\n" +
//                ",13526708509\n" +
//                ",13391257235\n" +
//                ",15801602087\n" +
//                ",18917698788\n" +
//                ",13648312192\n" +
//                ",15088627652\n" +
//                ",18705429055\n" +
//                ",13400468770\n" +
//                ",13616878969\n" +
//                ",18627096211\n" +
//                ",13322247761\n" +
//                ",13609455266\n" +
//                ",15921498063\n" +
//                ",15800318426\n" +
//                ",15800318426\n" +
//                ",15800318426\n" +
//                ",13616878969\n" +
//                ",15033967878\n" +
//                ",13893870199\n" +
//                ",18576612375\n" +
//                ",18250866525\n" +
//                ",15826068452\n" +
//                ",15989826123\n" +
//                ",18858000585\n" +
//                ",15830363330\n" +
//                ",15003215223\n" +
//                ",18725565052\n" +
//                ",13102836869\n" +
//                ",17756923189\n" +
//                ",17756923189\n" +
//                ",13102836869\n" +
//                ",13612284341\n" +
//                ",18201786097\n" +
//                ",18201786097\n" +
//                ",15022899682\n" +
//                ",13917847419\n" +
//                ",17366262460\n" +
//                ",13489199509\n" +
//                ",18981373555\n" +
//                ",18981373555\n" +
//                ",15198286198\n" +
//                ",18502728280\n" +
//                ",8502728280\n" +
//                ",18514584296\n" +
//                ",13649179627\n" +
//                ",13649179627\n" +
//                ",13014661055\n" +
//                ",13014661055\n" +
//                ",13014661055\n" +
//                ",13526123070\n" +
//                ",13526123070\n" +
//                ",15987179151\n" +
//                ",15032937702\n" +
//                ",15631539885\n" +
//                ",15980206077\n" +
//                ",15531111000\n" +
//                ",18610226550\n" +
//                ",13093135960\n" +
//                ",13609970503\n" +
//                ",18192196951\n" +
//                ",18997681240\n" +
//                ",13915509739\n" +
//                ",18662995126\n" +
//                ",15153133577\n" +
//                ",18146530561\n" +
//                ",13810722839\n" +
//                ",13011682015\n" +
//                ",18623434165\n" +
//                ",15209953867\n" +
//                ",13004375750\n" +
//                ",13317319798\n" +
//                ",15232986307\n" +
//                ",18626081604\n" +
//                ",15201477740\n" +
//                ",18530123010\n" +
//                ",15505515657\n" +
//                ",18364794041\n" +
//                ",18868156810\n" +
//                ",13959417007\n" +
//                ",17361974037\n" +
//                ",17602266953\n" +
//                ",15506317012\n" +
//                ",15625011688\n" +
//                ",15506317012\n" +
//                ",15022020201\n" +
//                ",15653920277\n" +
//                ",13104636220\n" +
//                ",15979705867\n" +
//                ",15038638302\n" +
//                ",15873399922\n" +
//                ",18322192356\n" +
//                ",18501050225\n" +
//                ",13598772360\n" +
//                ",13520280635\n" +
//                ",18911927400\n" +
//                ",18611103904\n" +
//                ",15506317012\n" +
//                ",13677544852\n" +
//                ",13722683120\n" +
//                ",15751883173\n" +
//                ",15851845113\n" +
//                ",15326867278\n" +
//                ",18635221988\n" +
//                ",13543983043";
//
//        String lines[] = context.split("\\n");
//
//
//        List<CommonSpecialRosterRequestVO> list = new ArrayList<>();
//        String middle = "";
//        for (int i = 0; i < lines.length; i++) {
//            String[] split = lines[i].split(",");
//            CommonSpecialRosterRequestVO request = new CommonSpecialRosterRequestVO();
//            request.setPageNo(null);
//            request.setPageSize(null);
//            request.setSidx(null);
//            request.setSord(null);
//
//            request.setPhone(split[1].replaceAll("\r|\t", "").replace(" ", ""));
//            request.setName(split[0].replaceAll("\r|\t", "").replace(" ", ""));
//            request.setChannelId("00003");
//            request.setChannelName("攒钱课代表");
//            request.setRostersType("SUPER_WHITE");
//            request.setRostersValue("true");
//            request.setOperatePeopleName("liufangzhou");
//            list.add(request);
//        }
//        middle = middle + JsonHelper.toJson(list);
//
//        System.out.println(middle);
//
//        String pre = "curl -H \"Content-Type: application/json\" -X POST -d '";
//
//
//        String end = " 'http://127.0.0.1:8033/api/mis/specialRoster/v1/insert/list';";
//
//
//        String result = pre + middle + "'" + end;
//        System.out.println(result);
//
//
//    }
//}