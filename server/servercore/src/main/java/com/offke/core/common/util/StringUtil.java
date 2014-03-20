package com.offke.core.common.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-19
 * Time: 上午11:19
 */
public class StringUtil {
    private static final Logger _logger = LoggerFactory.getLogger(StringUtil.class);

    private StringUtil() {
    }

    public static void main(String args[]) {
        String _Insert = "INSERT INTO `zt_effort` (`company`, `objectType`, `objectID`, `product`, `project`, `account`, `WORK`,`DATE`, `LEFT`, `consumed`, `BEGIN`, `END`) " +
                "VALUES ({0}, '{1}', {2}, '{3}', {4}, '{5}', '{6}', '{7}', {8}, {9}, {10},{11})";

        String zt_company = "1";
        String zt_objectType = "custom";
        String zt_objectID = "0";
        String zt_product = ",0,";
        String zt_project = "0";
        String zt_account = "phy";
        String zt_WORK = "dddddddddddddd";
        String zt_DATE = "2013-02-01";
        String zt_LEFT = "0";
        String zt_consumed = "111";
        String zt_BEGIN = "0";
        String zt_END = "0";

        String[][] replaceObject = {
                new String[]{"\\{0\\}", zt_company},
                new String[]{"\\{1\\}", zt_objectType},
                new String[]{"\\{2\\}", zt_objectID},
                new String[]{"\\{3\\}", zt_product},
                new String[]{"\\{4\\}", zt_project},
                new String[]{"\\{5\\}", zt_account},
                new String[]{"\\{6\\}", zt_WORK},
                new String[]{"\\{7\\}", zt_DATE},
                new String[]{"\\{8\\}", zt_LEFT},
                new String[]{"\\{9\\}", zt_consumed},
                new String[]{"\\{10\\}", zt_BEGIN},
                new String[]{"\\{11\\}", zt_END},

        };
        System.out.println(replacePatternString(_Insert, replaceObject));


        String pw="380e19474844746afedbd68cecb943eb";

        System.out.println(DigestUtils.md5Hex("macson"));
        System.out.println(pw);


    }


    /**
     * revert String[]
     *
     * @param strings String[]
     * @return reverted string
     */
    public static String revert(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (int i = (strings.length - 1); i >= 0; i--) {
            sb.append(strings[i]);
        }

        return sb.toString();
    }

    /**
     * 通过字符串截取，例如str= 'aaaa'bbb'
     *
     * @param str      被截取字符串
     * @param startStr 第一个字符startStr='
     * @param endStr   第二个字符 endStr='
     * @return 返回串：aaaa
     */
    public static String getSubString(String str, String startStr, String endStr) {
        String retrunStr = str;
        try {
            retrunStr = str.substring(str.indexOf(startStr) + 1, str.indexOf(endStr));
        } catch (Exception ex) {
            _logger.error(ex.getMessage());
        }
        return retrunStr;

    }

    /**
     * @param str
     * @param rightPadString
     * @param length
     * @return
     */
    public static String getTextString(String str, String rightPadString, int length) {
        String _returnString = formatString(str, length);
        if (_returnString.length() != str.length()) {
            _returnString = _returnString + rightPadString;
        }

        return _returnString;
    }

    protected static String formatString(String str, int length) {
        String _returnString = str;
        if (str.length() > length) {
            _returnString = str.substring(0, length - 1);
        }

        return _returnString;

    }


    /**
     * 获取标签
     *
     * @param str
     * @return
     */
    public static List getLabelValue(String str) {
        List<String> returnValue = new ArrayList();
        Matcher m = Pattern.compile("\\$\\{(.*?)\\}").matcher(str);
        while (m.find()) {
            returnValue.add(m.group(1));
        }
        return returnValue;
    }

    /**
     * 判断标签是否正确
     *
     * @param str 标签名称
     * @return true 为正确 false 为不正确
     */
    public static boolean isRightLabelValue(String str) {
        boolean returnValue = false;
        Matcher m = Pattern.compile("\\$\\{(.*?)\\}").matcher(str);
        while (m.find()) {
            if (str.equals(m.group(1))) {
                returnValue = true;
                break;
            }
        }
        return returnValue;
    }

    /**
     * 判断是否存在标签
     *
     * @param str 需要检查的内容
     * @return true 为存在 false 为不存在
     */
    public static boolean isExistLabelValue(String str) {
        Matcher m = Pattern.compile("\\$\\{(.*?)\\}").matcher(str);
        return m.find() ? true : false;
    }

    /**
     * <p>
     * Removes control characters, including whitespace, from both ends of this
     * String, handling <code>null</code> by returning <code>null</code>.
     * </p>
     *
     * @param str the String to check
     * @return the trimmed text (or <code>null</code>)
     * @see java.lang.String#trim()
     */
    public static String trim(String str) {
        return (str == null ? null : str.trim());
    }

    public static String getFirstLetter(String hz) {

        String ls_second_eng = "CJWGNSPGCGNESYPBTYYZDXYKYGTDJNNJQMBSGZSCYJSYYQPGKBZGYCYWJKGKLJSWKPJQHYTWDDZLSGMRYPYWWCCKZNKYDGTTNGJEYKKZYTCJNMCYLQLYPYQFQRPZSLWBTGKJFYXJWZLTBNCXJJJJZXDTTSQZYCDXXHGCKBPHFFSSWYBGMXLPBYLLLHLXSPZMYJHSOJNGHDZQYKLGJHSGQZHXQGKEZZWYSCSCJXYEYXADZPMDSSMZJZQJYZCDJZWQJBDZBXGZNZCPWHKXHQKMWFBPBYDTJZZKQHYLYGXFPTYJYYZPSZLFCHMQSHGMXXSXJJSDCSBBQBEFSJYHWWGZKPYLQBGLDLCCTNMAYDDKSSNGYCSGXLYZAYBNPTSDKDYLHGYMYLCXPYCJNDQJWXQXFYYFJLEJBZRXCCQWQQSBNKYMGPLBMJRQCFLNYMYQMSQTRBCJTHZTQFRXQ"
                + "HXMJJCJLXQGJMSHZKBSWYEMYLTXFSYDSGLYCJQXSJNQBSCTYHBFTDCYZDJWYGHQFRXWCKQKXEBPTLPXJZSRMEBWHJLBJSLYYSMDXLCLQKXLHXJRZJMFQHXHWYWSBHTRXXGLHQHFNMNYKLDYXZPWLGGTMTCFPAJJZYLJTYANJGBJPLQGDZYQYAXBKYSECJSZNSLYZHZXLZCGHPXZHZNYTDSBCJKDLZAYFMYDLEBBGQYZKXGLDNDNYSKJSHDLYXBCGHXYPKDJMMZNGMMCLGWZSZXZJFZNMLZZTHCSYDBDLLSCDDNLKJYKJSYCJLKOHQASDKNHCSGANHDAASHTCPLCPQYBSDMPJLPCJOQLCDHJJYSPRCHNWJNLHLYYQYYWZPTCZGWWMZFFJQQQQYXACLBHKDJXDGMMYDJXZLLSYGXGKJRYWZWYCLZMSSJZLDBYDCFCXYHLXCHYZJQSFQAGMNYXPFRKSSB"
                + "JLYXYSYGLNSCMHCWWMNZJJLXXHCHSYDSTTXRYCYXBYHCSMXJSZNPWGPXXTAYBGAJCXLYSDCCWZOCWKCCSBNHCPDYZNFCYYTYCKXKYBSQKKYTQQXFCWCHCYKELZQBSQYJQCCLMTHSYWHMKTLKJLYCXWHEQQHTQHZPQSQSCFYMMDMGBWHWLGSSLYSDLMLXPTHMJHWLJZYHZJXHTXJLHXRSWLWZJCBXMHZQXSDZPMGFCSGLSXYMJSHXPJXWMYQKSMYPLRTHBXFTPMHYXLCHLHLZYLXGSSSSTCLSLDCLRPBHZHXYYFHBBGDMYCNQQWLQHJJZYWJZYEJJDHPBLQXTQKWHLCHQXAGTLXLJXMSLXHTZKZJECXJCJNMFBYCSFYWYBJZGNYSDZSQYRSLJPCLPWXSDWEJBJCBCNAYTWGMPAPCLYQPCLZXSBNMSGGFNZJJBZSFZYNDXHPLQKZCZWALSBCCJXJYZGWKYP"
                + "SGXFZFCDKHJGXDLQFSGDSLQWZKXTMHSBGZMJZRGLYJBPMLMSXLZJQQHZYJCZYDJWBMJKLDDPMJEGXYHYLXHLQYQHKYCWCJMYYXNATJHYCCXZPCQLBZWWYTWBQCMLPMYRJCCCXFPZNZZLJPLXXYZTZLGDLDCKLYRZZGQTGJHHHJLJAXFGFJZSLCFDQZLCLGJDJCSNCLLJPJQDCCLCJXMYZFTSXGCGSBRZXJQQCTZHGYQTJQQLZXJYLYLBCYAMCSTYLPDJBYREGKLZYZHLYSZQLZNWCZCLLWJQJJJKDGJZOLBBZPPGLGHTGZXYGHZMYCNQSYCYHBHGXKAMTXYXNBSKYZZGJZLQJDFCJXDYGJQJJPMGWGJJJPKQSBGBMMCJSSCLPQPDXCDYYKYFCJDDYYGYWRHJRTGZNYQLDKLJSZZGZQZJGDYKSHPZMTLCPWNJAFYZDJCNMWESCYGLBTZCGMSSLLYXQSXSBSJS"
                + "BBSGGHFJLWPMZJNLYYWDQSHZXTYYWHMCYHYWDBXBTLMSYYYFSXJCSDXXLHJHFSSXZQHFZMZCZTQCXZXRTTDJHNNYZQQMNQDMMGYYDXMJGDHCDYZBFFALLZTDLTFXMXQZDNGWQDBDCZJDXBZGSQQDDJCMBKZFFXMKDMDSYYSZCMLJDSYNSPRSKMKMPCKLGDBQTFZSWTFGGLYPLLJZHGJJGYPZLTCSMCNBTJBQFKTHBYZGKPBBYMTTSSXTBNPDKLEYCJNYCDYKZDDHQHSDZSCTARLLTKZLGECLLKJLQJAQNBDKKGHPJTZQKSECSHALQFMMGJNLYJBBTMLYZXDCJPLDLPCQDHZYCBZSCZBZMSLJFLKRZJSNFRGJHXPDHYJYBZGDLQCSEZGXLBLGYXTWMABCHECMWYJYZLLJJYHLGBDJLSLYGKDZPZXJYYZLWCXSZFGWYYDLYHCLJSCMBJHBLYZLYCBLYDPDQYSXQZB"
                + "YTDKYXJYYCNRJMDJGKLCLJBCTBJDDBBLBLCZQRPXJCGLZCSHLTOLJNMDDDLNGKAQHQHJGYKHEZNMSHRPHQQJCHGMFPRXHJGDYCHGHLYRZQLCYQJNZSQTKQJYMSZSWLCFQQQXYFGGYPTQWLMCRNFKKFSYYLQBMQAMMMYXCTPSHCPTXXZZSMPhpSHMCLMLDQFYQXSZYJDJJZZHQPDSZGLSTJBCKBXYQZJSGPSXQZQZRQTBDKYXZKHHGFLBCSMDLDGDZDBLZYYCXNNCSYBZBFGLZZXSWMSCCMQNJQSBDQSJTXXMBLTXZCLZSHZCXRQJGJYLXZFJPHYMZQQYDFQJJLZZNZJCDGZYGCTXMZYSCTLKPHTXHTLBJXJLXSCDQXCBBTJFQZFSLTJBTKQBXXJJLJCHCZDBZJDCZJDCPRNPQCJPFCZLCLZXZDMXMPHJSGZGSZZQJYLWTJPFSYASMCJBTZKYCWMYTCSJJLJCQLWZM"
                + "ALBXYFBPNLSFHTGJWEJJXXGLLJSTGSHJQLZFKCGNNDSZFDEQFHBSAQTGLLBXMMYGSZLDYDQMJJRGBJTKGDHGKBLQKBDMBYLXWCXYTTYBKMRTJZXQJBHLMHMJJZMQASLDCYXYQDLQCAFYWYXQHZYYJFYMQ";
        String ls_second_ch = "亍丌兀丐廿卅丕亘丞鬲孬噩丨禺丿匕乇夭爻卮氐囟胤馗毓睾鼗丶亟"
                + "鼐乜乩亓芈孛啬嘏仄厍厝厣厥厮靥赝匚叵匦匮匾赜卦卣刂刈刎刭刳刿剀剌剞剡剜蒯剽劂劁劐劓冂罔亻仃仉仂仨仡仫仞伛仳伢佤仵伥伧伉伫佞佧攸佚佝佟佗伲伽佶佴侑侉侃侏佾佻侪佼侬侔俦俨俪俅俚俣俜俑俟俸倩偌俳倬倏倮倭俾倜倌倥倨偾偃偕偈偎偬偻傥傧傩傺僖儆僭僬僦僮儇儋仝氽佘佥俎龠汆籴兮巽黉馘冁夔勹匍訇匐凫夙兕亠兖亳衮袤亵脔裒禀嬴蠃羸冫冱冽冼凇冖冢冥讠讦讧讪讴讵讷诂诃诋诏诎诒诓诔诖诘诙诜诟诠诤诨诩诮诰诳诶诹诼诿谀谂谄谇谌谏谑谒谔谕谖谙谛谘谝谟谠谡谥谧谪谫谮谯谲谳谵谶卩卺阝阢阡阱阪阽阼"
                + "陂陉陔陟陧陬陲陴隈隍隗隰邗邛邝邙邬邡邴邳邶邺邸邰郏郅邾郐郄郇郓郦郢郜郗郛郫郯郾鄄鄢鄞鄣鄱鄯鄹酃酆刍奂劢劬劭劾哿勐勖勰叟燮矍廴凵凼鬯厶弁畚巯坌垩垡塾墼壅壑圩圬圪圳圹圮圯坜圻坂坩垅坫垆坼坻坨坭坶坳垭垤垌垲埏垧垴垓垠埕埘埚埙埒垸埴埯埸埤埝堋堍埽埭堀堞堙塄堠塥塬墁墉墚墀馨鼙懿艹艽艿芏芊芨芄芎芑芗芙芫芸芾芰苈苊苣芘芷芮苋苌苁芩芴芡芪芟苄苎芤苡茉苷苤茏茇苜苴苒苘茌苻苓茑茚茆茔茕苠苕茜荑荛荜茈莒茼茴茱莛荞茯荏荇荃荟荀茗荠茭茺茳荦荥荨茛荩荬荪荭荮莰荸莳莴莠莪莓莜莅荼莶莩荽莸荻"
                + "莘莞莨莺莼菁萁菥菘堇萘萋菝菽菖萜萸萑萆菔菟萏萃菸菹菪菅菀萦菰菡葜葑葚葙葳蒇蒈葺蒉葸萼葆葩葶蒌蒎萱葭蓁蓍蓐蓦蒽蓓蓊蒿蒺蓠蒡蒹蒴蒗蓥蓣蔌甍蔸蓰蔹蔟蔺蕖蔻蓿蓼蕙蕈蕨蕤蕞蕺瞢蕃蕲蕻薤薨薇薏蕹薮薜薅薹薷薰藓藁藜藿蘧蘅蘩蘖蘼廾弈夼奁耷奕奚奘匏尢尥尬尴扌扪抟抻拊拚拗拮挢拶挹捋捃掭揶捱捺掎掴捭掬掊捩掮掼揲揸揠揿揄揞揎摒揆掾摅摁搋搛搠搌搦搡摞撄摭撖摺撷撸撙撺擀擐擗擤擢攉攥攮弋忒甙弑卟叱叽叩叨叻吒吖吆呋呒呓呔呖呃吡呗呙吣吲咂咔呷呱呤咚咛咄呶呦咝哐咭哂咴哒咧咦哓哔呲咣哕咻咿哌哙哚哜咩"
                + "咪咤哝哏哞唛哧唠哽唔哳唢唣唏唑唧唪啧喏喵啉啭啁啕唿啐唼唷啖啵啶啷唳唰啜喋嗒喃喱喹喈喁喟啾嗖喑啻嗟喽喾喔喙嗪嗷嗉嘟嗑嗫嗬嗔嗦嗝嗄嗯嗥嗲嗳嗌嗍嗨嗵嗤辔嘞嘈嘌嘁嘤嘣嗾嘀嘧嘭噘嘹噗嘬噍噢噙噜噌噔嚆噤噱噫噻噼嚅嚓嚯囔囗囝囡囵囫囹囿圄圊圉圜帏帙帔帑帱帻帼帷幄幔幛幞幡岌屺岍岐岖岈岘岙岑岚岜岵岢岽岬岫岱岣峁岷峄峒峤峋峥崂崃崧崦崮崤崞崆崛嵘崾崴崽嵬嵛嵯嵝嵫嵋嵊嵩嵴嶂嶙嶝豳嶷巅彳彷徂徇徉後徕徙徜徨徭徵徼衢彡犭犰犴犷犸狃狁狎狍狒狨狯狩狲狴狷猁狳猃狺狻猗猓猡猊猞猝猕猢猹猥猬猸猱獐獍獗獠獬獯獾"
                + "舛夥飧夤夂饣饧饨饩饪饫饬饴饷饽馀馄馇馊馍馐馑馓馔馕庀庑庋庖庥庠庹庵庾庳赓廒廑廛廨廪膺忄忉忖忏怃忮怄忡忤忾怅怆忪忭忸怙怵怦怛怏怍怩怫怊怿怡恸恹恻恺恂恪恽悖悚悭悝悃悒悌悛惬悻悱惝惘惆惚悴愠愦愕愣惴愀愎愫慊慵憬憔憧憷懔懵忝隳闩闫闱闳闵闶闼闾阃阄阆阈阊阋阌阍阏阒阕阖阗阙阚丬爿戕氵汔汜汊沣沅沐沔沌汨汩汴汶沆沩泐泔沭泷泸泱泗沲泠泖泺泫泮沱泓泯泾洹洧洌浃浈洇洄洙洎洫浍洮洵洚浏浒浔洳涑浯涞涠浞涓涔浜浠浼浣渚淇淅淞渎涿淠渑淦淝淙渖涫渌涮渫湮湎湫溲湟溆湓湔渲渥湄滟溱溘滠漭滢溥溧溽溻溷滗溴滏溏滂"
                + "溟潢潆潇漤漕滹漯漶潋潴漪漉漩澉澍澌潸潲潼潺濑濉澧澹澶濂濡濮濞濠濯瀚瀣瀛瀹瀵灏灞宀宄宕宓宥宸甯骞搴寤寮褰寰蹇謇辶迓迕迥迮迤迩迦迳迨逅逄逋逦逑逍逖逡逵逶逭逯遄遑遒遐遨遘遢遛暹遴遽邂邈邃邋彐彗彖彘尻咫屐屙孱屣屦羼弪弩弭艴弼鬻屮妁妃妍妩妪妣妗姊妫妞妤姒妲妯姗妾娅娆姝娈姣姘姹娌娉娲娴娑娣娓婀婧婊婕娼婢婵胬媪媛婷婺媾嫫媲嫒嫔媸嫠嫣嫱嫖嫦嫘嫜嬉嬗嬖嬲嬷孀尕尜孚孥孳孑孓孢驵驷驸驺驿驽骀骁骅骈骊骐骒骓骖骘骛骜骝骟骠骢骣骥骧纟纡纣纥纨纩纭纰纾绀绁绂绉绋绌绐绔绗绛绠绡绨绫绮绯绱绲缍绶绺绻绾缁缂缃"
                + "缇缈缋缌缏缑缒缗缙缜缛缟缡缢缣缤缥缦缧缪缫缬缭缯缰缱缲缳缵幺畿巛甾邕玎玑玮玢玟珏珂珑玷玳珀珉珈珥珙顼琊珩珧珞玺珲琏琪瑛琦琥琨琰琮琬琛琚瑁瑜瑗瑕瑙瑷瑭瑾璜璎璀璁璇璋璞璨璩璐璧瓒璺韪韫韬杌杓杞杈杩枥枇杪杳枘枧杵枨枞枭枋杷杼柰栉柘栊柩枰栌柙枵柚枳柝栀柃枸柢栎柁柽栲栳桠桡桎桢桄桤梃栝桕桦桁桧桀栾桊桉栩梵梏桴桷梓桫棂楮棼椟椠棹椤棰椋椁楗棣椐楱椹楠楂楝榄楫榀榘楸椴槌榇榈槎榉楦楣楹榛榧榻榫榭槔榱槁槊槟榕槠榍槿樯槭樗樘橥槲橄樾檠橐橛樵檎橹樽樨橘橼檑檐檩檗檫猷獒殁殂殇殄殒殓殍殚殛殡殪轫轭轱轲轳轵轶"
                + "轸轷轹轺轼轾辁辂辄辇辋辍辎辏辘辚軎戋戗戛戟戢戡戥戤戬臧瓯瓴瓿甏甑甓攴旮旯旰昊昙杲昃昕昀炅曷昝昴昱昶昵耆晟晔晁晏晖晡晗晷暄暌暧暝暾曛曜曦曩贲贳贶贻贽赀赅赆赈赉赇赍赕赙觇觊觋觌觎觏觐觑牮犟牝牦牯牾牿犄犋犍犏犒挈挲掰搿擘耄毪毳毽毵毹氅氇氆氍氕氘氙氚氡氩氤氪氲攵敕敫牍牒牖爰虢刖肟肜肓肼朊肽肱肫肭肴肷胧胨胩胪胛胂胄胙胍胗朐胝胫胱胴胭脍脎胲胼朕脒豚脶脞脬脘脲腈腌腓腴腙腚腱腠腩腼腽腭腧塍媵膈膂膑滕膣膪臌朦臊膻臁膦欤欷欹歃歆歙飑飒飓飕飙飚殳彀毂觳斐齑斓於旆旄旃旌旎旒旖炀炜炖炝炻烀炷炫炱烨烊焐焓焖焯焱"
                + "煳煜煨煅煲煊煸煺熘熳熵熨熠燠燔燧燹爝爨灬焘煦熹戾戽扃扈扉礻祀祆祉祛祜祓祚祢祗祠祯祧祺禅禊禚禧禳忑忐怼恝恚恧恁恙恣悫愆愍慝憩憝懋懑戆肀聿沓泶淼矶矸砀砉砗砘砑斫砭砜砝砹砺砻砟砼砥砬砣砩硎硭硖硗砦硐硇硌硪碛碓碚碇碜碡碣碲碹碥磔磙磉磬磲礅磴礓礤礞礴龛黹黻黼盱眄眍盹眇眈眚眢眙眭眦眵眸睐睑睇睃睚睨睢睥睿瞍睽瞀瞌瞑瞟瞠瞰瞵瞽町畀畎畋畈畛畲畹疃罘罡罟詈罨罴罱罹羁罾盍盥蠲钅钆钇钋钊钌钍钏钐钔钗钕钚钛钜钣钤钫钪钭钬钯钰钲钴钶钷钸钹钺钼钽钿铄铈铉铊铋铌铍铎铐铑铒铕铖铗铙铘铛铞铟铠铢铤铥铧铨铪铩铫铮铯铳铴铵铷铹铼"
                + "铽铿锃锂锆锇锉锊锍锎锏锒锓锔锕锖锘锛锝锞锟锢锪锫锩锬锱锲锴锶锷锸锼锾锿镂锵镄镅镆镉镌镎镏镒镓镔镖镗镘镙镛镞镟镝镡镢镤镥镦镧镨镩镪镫镬镯镱镲镳锺矧矬雉秕秭秣秫稆嵇稃稂稞稔稹稷穑黏馥穰皈皎皓皙皤瓞瓠甬鸠鸢鸨鸩鸪鸫鸬鸲鸱鸶鸸鸷鸹鸺鸾鹁鹂鹄鹆鹇鹈鹉鹋鹌鹎鹑鹕鹗鹚鹛鹜鹞鹣鹦鹧鹨鹩鹪鹫鹬鹱鹭鹳疒疔疖疠疝疬疣疳疴疸痄疱疰痃痂痖痍痣痨痦痤痫痧瘃痱痼痿瘐瘀瘅瘌瘗瘊瘥瘘瘕瘙瘛瘼瘢瘠癀瘭瘰瘿瘵癃瘾瘳癍癞癔癜癖癫癯翊竦穸穹窀窆窈窕窦窠窬窨窭窳衤衩衲衽衿袂裆袷袼裉裢裎裣裥裱褚裼裨裾裰褡褙褓褛褊褴褫褶襁襦疋胥皲皴矜耒"
                + "耔耖耜耠耢耥耦耧耩耨耱耋耵聃聆聍聒聩聱覃顸颀颃颉颌颍颏颔颚颛颞颟颡颢颥颦虍虔虬虮虿虺虼虻蚨蚍蚋蚬蚝蚧蚣蚪蚓蚩蚶蛄蚵蛎蚰蚺蚱蚯蛉蛏蚴蛩蛱蛲蛭蛳蛐蜓蛞蛴蛟蛘蛑蜃蜇蛸蜈蜊蜍蜉蜣蜻蜞蜥蜮蜚蜾蝈蜴蜱蜩蜷蜿螂蜢蝽蝾蝻蝠蝰蝌蝮螋蝓蝣蝼蝤蝙蝥螓螯螨蟒蟆螈螅螭螗螃螫蟥螬螵螳蟋蟓螽蟑蟀蟊蟛蟪蟠蟮蠖蠓蟾蠊蠛蠡蠹蠼缶罂罄罅舐竺竽笈笃笄笕笊笫笏筇笸笪笙笮笱笠笥笤笳笾笞筘筚筅筵筌筝筠筮筻筢筲筱箐箦箧箸箬箝箨箅箪箜箢箫箴篑篁篌篝篚篥篦篪簌篾篼簏簖簋簟簪簦簸籁籀臾舁舂舄臬衄舡舢舣舭舯舨舫舸舻舳舴舾艄艉艋艏艚艟艨衾袅袈裘裟襞羝羟"
                + "羧羯羰羲籼敉粑粝粜粞粢粲粼粽糁糇糌糍糈糅糗糨艮暨羿翎翕翥翡翦翩翮翳糸絷綦綮繇纛麸麴赳趄趔趑趱赧赭豇豉酊酐酎酏酤酢酡酰酩酯酽酾酲酴酹醌醅醐醍醑醢醣醪醭醮醯醵醴醺豕鹾趸跫踅蹙蹩趵趿趼趺跄跖跗跚跞跎跏跛跆跬跷跸跣跹跻跤踉跽踔踝踟踬踮踣踯踺蹀踹踵踽踱蹉蹁蹂蹑蹒蹊蹰蹶蹼蹯蹴躅躏躔躐躜躞豸貂貊貅貘貔斛觖觞觚觜觥觫觯訾謦靓雩雳雯霆霁霈霏霎霪霭霰霾龀龃龅龆龇龈龉龊龌黾鼋鼍隹隼隽雎雒瞿雠銎銮鋈錾鍪鏊鎏鐾鑫鱿鲂鲅鲆鲇鲈稣鲋鲎鲐鲑鲒鲔鲕鲚鲛鲞鲟鲠鲡鲢鲣鲥鲦鲧鲨鲩鲫鲭鲮鲰鲱鲲鲳鲴鲵鲶鲷鲺鲻鲼鲽鳄鳅鳆鳇鳊鳋鳌鳍鳎鳏鳐鳓鳔"
                + "鳕鳗鳘鳙鳜鳝鳟鳢靼鞅鞑鞒鞔鞯鞫鞣鞲鞴骱骰骷鹘骶骺骼髁髀髅髂髋髌髑魅魃魇魉魈魍魑飨餍餮饕饔髟髡髦髯髫髻髭髹鬈鬏鬓鬟鬣麽麾縻麂麇麈麋麒鏖麝麟黛黜黝黠黟黢黩黧黥黪黯鼢鼬鼯鼹鼷鼽鼾齄贠旸珺昉堉旻啟";

        // byte[] array = new byte[2];

        String return_py = "";
        for (int i = 1; i < hz.length() + 1; i++) {
            String h = hz.substring(i - 1, i);
            String firstbyte = "";
            firstbyte = getascii(h);
            if (Integer
                    .parseInt(firstbyte.substring(0, firstbyte.indexOf("-"))) < 176
                    && Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) != 149
                    && Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) != 172
                    && Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) != 136
                    && Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) != 134) { // .非汉字
                return_py += h;
            } else if (Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) >= 176
                    && Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) <= 215) { // 一级汉字
                if (firstbyte.compareTo(getascii("匝")) >= 0) {
                    return_py += "z";
                } else if (firstbyte.compareTo(getascii("压")) >= 0) {
                    return_py += "y";
                } else if (firstbyte.compareTo(getascii("昔")) >= 0) {
                    return_py += "x";
                } else if (firstbyte.compareTo(getascii("挖")) >= 0) {
                    return_py += "w";
                } else if (firstbyte.compareTo(getascii("塌")) >= 0) {
                    return_py += "t";
                } else if (firstbyte.compareTo(getascii("撒")) >= 0) {
                    return_py += "s";
                } else if (firstbyte.compareTo(getascii("然")) >= 0) {
                    return_py += "r";
                } else if (firstbyte.compareTo(getascii("期")) >= 0) {
                    return_py += "q";
                } else if (firstbyte.compareTo(getascii("啪")) >= 0) {
                    return_py += "p";
                } else if (firstbyte.compareTo(getascii("哦")) >= 0) {
                    return_py += "o";
                } else if (firstbyte.compareTo(getascii("拿")) >= 0) {
                    return_py += "n";
                } else if (firstbyte.compareTo(getascii("妈")) >= 0) {
                    return_py += "m";
                } else if (firstbyte.compareTo(getascii("垃")) >= 0) {
                    return_py += "l";
                } else if (firstbyte.compareTo(getascii("喀")) >= 0) {
                    return_py += "k";
                } else if (firstbyte.compareTo(getascii("击")) >= 0) {
                    return_py += "j";
                } else if (firstbyte.compareTo(getascii("哈")) >= 0) {
                    return_py += "h";
                } else if (firstbyte.compareTo(getascii("噶")) >= 0) {
                    return_py += "g";
                } else if (firstbyte.compareTo(getascii("发")) >= 0) {
                    return_py += "f";
                } else if (firstbyte.compareTo(getascii("蛾")) >= 0) {
                    return_py += "e";
                } else if (firstbyte.compareTo(getascii("搭")) >= 0) {
                    return_py += "d";
                } else if (firstbyte.compareTo(getascii("擦")) >= 0) {
                    return_py += "c";
                } else if (firstbyte.compareTo(getascii("芭")) >= 0) {
                    return_py += "b";
                } else if (firstbyte.compareTo(getascii("啊")) >= 0) {
                    return_py += "a";
                }
            } else if (Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) == 134
                    || Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) == 136
                    || Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) == 172
                    || Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) == 149
                    || Integer.parseInt(firstbyte.substring(0, firstbyte
                    .indexOf("-"))) >= 215) { // 二级汉字
                try {
                    return_py += ls_second_eng.substring(ls_second_ch
                            .indexOf(h), ls_second_ch.indexOf(h) + 1);
                } catch (Exception ex) {
                    return_py += "?";
                }
            }
        }
        return return_py.toLowerCase();
    }

    private static String getascii(String str) {
        byte[] array = null;
        int firstbyte = 0;
        int secondbyte = 0;
        try {
            array = String.valueOf(str).getBytes();
            if (array.length < 2) {
                firstbyte = array[0];
            } else {
                firstbyte = array[0] + 256;
                secondbyte = array[1] + 256;
            }
        } catch (Exception ex) {

        }

        return firstbyte + "-" + secondbyte;
    }


    /**
     * 去掉字符串中匹配 的字符串
     *
     * @param regex 要匹配表达式
     * @param orig  原始内容
     * @param state 匹配的字符串要替换成的内容
     * @return String newString 替换后的字符串
     */
    public static String toRegex(String regex, String orig, String state) {
        String returnValue = "";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(orig);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, state);
        }
        m.appendTail(sb);
        m = p.matcher(sb.toString());
        if (m.find()) {
            returnValue = toRegex(regex, sb.toString(), state);
        } else {
            returnValue = sb.toString();
        }
        return returnValue;
    }

    /**
     * 返回字符串中匹配 的字符串
     *
     * @param regex 要匹配表达式
     * @param orig  原始内容
     * @return String newString 匹配 第一组的字符串，空表示未找到
     */
    public static String toRegex(String regex, String orig) {
        String returnValue = "";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(orig);
        if (m.find()) {
            returnValue = m.group(0);
        }

        return returnValue;
    }

    public static String getSubString(String str, int begin, int end) {
        String retrunStr = str;
        try {
            if (str.length() >= end) {
                retrunStr = str.substring(begin, end);
            }
        } catch (Exception ex) {
            _logger.error(ex.getMessage());
        }
        return retrunStr;

    }

    /**
     * @param sourceString 带格式的原始字符串
     * @param object       要匹配的字符串数组 <br/>
     *                     example   <br/>
     *                     String[][] object={new String[]{"\\{0\\}","1995"},new String[]{"\\{1\\}","2007"}};  <br/>
     *                     String[][] object = {new String[]{"(<wp:category_nicename>)(.+?)(</wp:category_nicename>)", "1995"}};
     * @return 返回替换后的字符串
     */
    public static String replacePatternString(final String sourceString, Object[] object) {
        String temp = sourceString;
        for (Object anObject : object) {
            String[] result = (String[]) anObject;
            Pattern pattern = Pattern.compile(result[0]);
            Matcher matcher = pattern.matcher(temp);
            temp = matcher.replaceAll(result[1]);
        }
        return temp;
    }

    /**
     * @param orig     数据源
     * @param repeated 是否重复
     * @return 返回的唯一记录
     */
    public static List getUniqueString(List<String> orig, boolean repeated) {
        List<String> list = new LinkedList<String>();
        List<String> tempList = new ArrayList();
        tempList.addAll(orig);

        if (repeated) {
            for (int i = 0; i < tempList.size(); i++) {
                String value = tempList.get(i);
                int count = 0;
                for (String anOrig : orig) {
                    if (value.equals(anOrig)) {
                        count++;
                    }
                }
                if (count <= 1) {
                    orig.remove(value);
                }
            }
            list.addAll(orig);
        } else {
            for (String anOrig : orig) {
                if (!list.contains(anOrig)) {
                    list.add(anOrig);
                }
            }
        }

        return list;
    }

    /**
     * String --> InputStream
     *
     * @param str
     * @return
     */
    public static InputStream getInputStreamFromString(String str) {
        return new ByteArrayInputStream(str.getBytes());
    }

    /**
     * 返回格式化后的数据调试信息
     *
     * @param varName  变量名称
     * @param varValue 变量值
     * @return 返回内容格式为：变量名称=[变量值]
     */
    public static String getDebugString(String varName, Object varValue) {
        return varName + "=[" + varValue + "]";
    }

    /**
     * 按照指定分割长度sepLen将varValue进行定长分割并返回分割后的数据
     * 如： abcdefghh,2  则返回 [ab cd ed gh h]
     *
     * @param varName  变量名称
     * @param varValue 变量值
     * @param sepLen   分隔位置长度
     * @return 返回内容格式为：变量名称=[变量值]
     */
    public static String getDebugString(String varName, String varValue, int sepLen) {
        return varName + "=[" + getSepString(varValue, sepLen, " ") + "]";
    }

    /**
     * 按照指定分割长度sepLen将varValue进行定长分割并返回分割后的数据，分隔符为空格
     * 如： abcdefghh,2  则返回 [ab cd ed gh h]
     *
     * @param varValue  变量值
     * @param sepLen    分隔位置长度
     * @param sepString 分隔符
     * @return 返回内容格式为：变量名称=[变量值]
     */
    public static String getSepString(String varValue, int sepLen, String sepString) {
        int str_length = varValue.length();
        StringBuffer bitmap_binstr = new StringBuffer(str_length);
        for (int i = 0; i < str_length; i++) {
            bitmap_binstr.append(varValue.charAt(i));
            if ((i + 1) % sepLen == 0) {
                bitmap_binstr.append(sepString);
            }
        }
        return bitmap_binstr.toString();
    }

    /**
     * InputStream --> String
     *
     * @param is
     * @return String, read by line.
     * @throws IOException
     */
    public static String getStringFromIinputStream(InputStream is) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = in.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();
    }

    /**
     * Convert byte[] to hex string.这里我们可以将byte转换成int，然后利用Integer.toHexString(int)来转换成16进制字符串。
     *
     * @param src byte[] data
     * @return hex string
     */
    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (byte aSrc : src) {
            int v = aSrc & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * Convert byte[] to char[]。
     *
     * @param src byte[] data
     * @return char[]
     */
    public static char[] bytesToChars(byte[] src) {
        char[] returnValue = new char[src.length];
        if (src.length <= 0) {
            return null;
        }
        int i = 0;
        for (byte aSrc : src) {
            int v = aSrc & 0xFF;
            returnValue[i] = (char) v;
            i++;
        }
        _logger.debug("StringUtil.bytesToChars=[{}]", returnValue);
        return returnValue;

    }

    /**
     * Convert byte[] to char[]。
     *
     * @param src      byte[] data
     * @param encoding 编码格式
     * @return char[]
     */
    public static char[] bytesToChars(byte[] src, String encoding) {
        Charset cs = Charset.forName(encoding);
        ByteBuffer bb = ByteBuffer.allocate(src.length);
        bb.put(src);
        bb.flip();
        CharBuffer cb = cs.decode(bb);

        return cb.array();
    }

    /**
     * Convert byte[] to char[]。
     *
     * @param src      byte[] data
     * @param encoding 编码格式
     * @return char[]
     */
    public static byte[] charsToBytes(char[] src, String encoding) {
        Charset cs = Charset.forName(encoding);
        CharBuffer cb = CharBuffer.allocate(src.length);
        cb.put(src);
        cb.flip();
        ByteBuffer bb = cs.encode(cb);

        return bb.array();
    }

    /**
     * Convert byte[] to hex string.这里我们可以将byte转换成int，然后利用Integer.toHexString(int)来转换成16进制字符串。
     *
     * @param src byte[] data
     * @return hex string
     */
    public static String bytesToHexString(byte src) {
        StringBuilder stringBuilder = new StringBuilder("");
        int v = src & 0xFF;
        String hv = Integer.toHexString(v);
        if (hv.length() < 2) {
            stringBuilder.append(0);
        }
        stringBuilder.append(hv);
        return stringBuilder.toString();

    }

    /**
     * Convert hex string to byte[]
     *
     * @param hexString the hex string
     * @return byte[]
     */
    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        if (hexString.length() == 1) {
            hexString = StringUtils.leftPad(hexString, 2, "0");
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }


    /**
     * Convert char to byte
     *
     * @param c char
     * @return byte
     */
    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static ArrayList<String> getContentByRegex(String orig, String regexString) {
        ArrayList<String> returnValue = new ArrayList<String>();
        Pattern pattern = Pattern.compile(regexString);
        Matcher matcher = pattern.matcher(orig);
        while (matcher.find()) {
            returnValue.add(matcher.group(1));
        }
        return returnValue;
    }

    /**
     * String[] to String
     *
     * @param a         String Array
     * @param separator Separator
     * @return String with Separator
     */
    public static String arrayToString(String[] a, String separator) {
        String result = "";
        if (a.length > 0) {
            result = a[0];    // start with the first element
            for (int i = 1; i < a.length; i++) {
                result = result + separator + a[i];
            }
        }
        return result;
    }

    /**
     * String[] to String
     *
     * @param a         String Array
     * @param separator Separator
     * @return String with Separator
     */
    public static String arrayToString(char[] a, String separator) {
        String result = "";
        if (a.length > 0) {
            result = String.valueOf(a[0]);   // start with the first element

            for (int i = 1; i < a.length; i++) {
                result = result + separator + String.valueOf(a[i]);
            }
        }
        return result;
    }

    public static String charToHexString(char[] chars) {
        String result = "";
        for (char aChar : chars) {
            result = result + StringUtils.leftPad(String.valueOf(Integer.toHexString((int) aChar)), 2, "0");
        }
        return result;
    }

    public static ArrayList<String> charToHexStringList(char[] chars) {
        ArrayList<String> result = new ArrayList<String>();
        for (char aChar : chars) {
            result.add(StringUtils.leftPad(String.valueOf(Integer.toHexString((int) aChar)), 2, "0"));
        }
        return result;
    }

    /**
     * 为原始字符串的前后添加  '  号
     *
     * @param orig 原始字符串，如“abcd”
     * @return 返回  'abcd'
     */
    public static String getQuotaString(String orig) {
        return "'" + trim(orig) + "'";
    }
}
