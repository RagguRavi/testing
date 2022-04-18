package core.algo.InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeserializeSolution {
	public static void main(String args[]) {
		System.out.println(Arrays.toString(deserialize("yicvqkmwaqtpxcktttgmommczxqaqqektrjwwecjczpvvrhhwzmbpzidraallyhxrkjhyhbptqawduzkqxygrnx87~irqxusacuqenjrzaollvyxyuhbcxadowfkaniltfmbtevgxwpebdctsvzzxszhqglogvzpcuhkdfslwwgpemyig87~oowihyuuudhrevozlmmdliusrbmdzqexqirznadmglochdiriwwkrypukugtcbdmhcbztwyyriiprhefunaoheh87~zppsqxhfvehvsarxzjttsjwabbjwyhdpubjfutqbckpwfaancvhhzqtufpwkksamtdkxjsfsdzndxhhoarbxgyd87~fdnezzcrgmlwnipyudsqkxehkuunrferphokavbczynnpkuyqnxlmolwdjkshnndyhsqwyaxccozvtocbhcscmu87~pdnxlwbypmzkeygtwthokfacooswjdghbsglkhcnacwyctdyhejrivufbxuzalhgupuzfiscgdwmxshquwutcio87~kqgwawnggbbxjjolovdkzdinvrkpaexuteyfvtncejgavwamgomgeprtzsidhtutbenjngrgyugelpvierbintj87~ekhotpzshhgdzrhoiobmvgdpcipkuocmimrxdumpcoxhmzdhoutfsjivomhrpfgirvfkilaodiyqppxlghjfuld87~qwzkzoatmnmljapmsbmjmtrawiaeyyxvwvfdngbzibqlztlbhiejemoekaoqcoohemktinngbanklqltwexovwy87~eeixjyaqcenyhlwrhlqmeuezsyhhwijwmupbnwiezvgbgdghfjutchqnsfovnqheajzehhqbzaapztuxqgxvxwj87~kxlsphzrmasyaflgfomndexzovucqaimbdtlbygjsfjxfkfpjdygiptbjfmktmjtparpyjeqgqzhmieqyruwquy87~vvddmznhinjcfwmdtaugpqfxajfdmdbodidgkjnclldxzzeqztqgeinfnjkmgnwhtxvtrpddsvopvgahpqkubri87~rixytubljhesmfxyizmgeepxfclqtbwiavlisqdygmymulnupecvznlsozmgpuucymotazxwihvowkupnxlfshh87~yoflobcaxoktlnrzctkuewidwxhqyvolndcopssebuxwhenciuonkihtstxzvxwadctbxtjjsbxjruafibqipnh87~jtxfiopovxariycfewgwyysswweuctwvgkenpdxycmnltrzmpkqpxsywmdaigmsdjfvzlqxqtufehaujtmpyjur87~genykvluvbgtsjxrxvqpfzsagyrrojpnsvscmyqkivbvnlvmuubqrpxrlzxiwsuiodglsladybnqayffwihlkob87~yibnirqveepqfkysmkfaeotwreczyudwmhmhrhiwnlpschrvwrvrolpzojepmayazzlvaecnxnwackyiptywvbs87~iteajhuxsyoirrazzlbajnpiqroysqeazfzvkxvrryzfnwcspqrkohdzfcrmkwxucspgexumyonurucxuirnsoi87~xdjfoiuyzntovprghvxdaqysaggbasezxoevwqkyiziiwhxayjbsicjlyzwykyszvtepsgrwtogirukdnvurqgl87~hadmarvbzcbrxixgxdfxzuiwaalkqpaxhwnwrhjvgezejayhwvahryqavtklbdhjsdhhupeijncxcxlxvjoxctn87~gzhbuhwlsuemwjbegyludbrmosjwgirvhfnguinnverpilirpqofiievvemuseegkobgmdrzpctffczkuyooacm87~ucuvpbnyawlsarrxibmnignfmfqvgssjqlldwyohvqefzsajqkcrhxhzdcihnaorholqxjixurnqlvzcthjegxl87~gbjtctyiuuvksoftztklxkgcefcbqcfpllpwaovdzmeoiflbhkntylloipsqrghxxzkatgcasdasenlakxntnyo87~jpcwytatuzouvmtnsxkelepokcdvonxeopsafadbckffgogkhlwfwruffcpgabnptaitlvalnmruszurasqkntt87~tsuzuyaosuhlcsjonghladifpekrkzuqqyzzxewkeiszfgzyuyyylmqypmepakhmklogfpkyhzuordhpmkhjcow87~udopumcjjmlgodlpyqvqhwfibnkszghwgkoixcsadelexhtiprlsoejpdlbsxublvmkujsuwyiludxeualhkfnj87~kvkkgyartmadvsidsjxyahdmtyillrgjwfsmrmncgjpplrwpdabactwsmsiixtxpnfmdiufictvbujyfbvurkth87~djrmajkkqsthctgrbtxpwhdebrpyvgrssgietztulsipeyszvoomcmswrduamudokjakftnsnaaabhtthjakdsd87~ctqjavbunsfcutjswoihmbukkzjmmxglicoycnxgqqerhfgarbzhsbgicsevwaqgkouqcwgjvsmtgtjdsulcgzn87~elufcbinilbnjqmvbercwklrmdnkvknzwjthnkuqauboogmmeevslsmacfswqcfqlpigqrixgsqmwqajhwnksfn87~")));
	}
	
	 public static  String[] deserialize(String a) {
		 String str[] = a.split("~");
		 List<String> list = new ArrayList<>();
		 
		 for(String st : str) {
			 
			 int length = st.length();
			 
			 String tempStr = st.substring(0, length-1);
			 char temp =  tempStr.substring(tempStr.length()-1, tempStr.length()).toCharArray()[0];
			
			 while(temp >= 48 && temp <= 57 ) {
				 
				 tempStr = tempStr.substring(0, tempStr.length()-1);
				 temp =  tempStr.substring(tempStr.length()-1, tempStr.length()).toCharArray()[0];
			 }
			 
			 st = tempStr;
			
			 list.add(st);
		 }
		 
		 return list.toArray(str);
	    }
}
