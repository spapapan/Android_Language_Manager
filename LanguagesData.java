package com.app.babyapp.data;

import com.app.babyapp.R;
import com.app.babyapp.model.main.LanguageItem;
import java.util.ArrayList;
import java.util.Arrays;

public class LanguagesData {

    /**
     *  **** DO NOT CHANGE ****
     *
     *     Language Index IDs
     *
     *  Those IDs are hardcoded and used in multiple
     *  sections of Local and Online Database.
     *
     *  1. Youtube Videos and Channels
     *  2. Books
     *  3. Exercises, Lessons, Profiles
     *  4. Probably more...
     *
     *
     *  Sort order:
     *  https://cloud.google.com/translate/docs/languages
     *
     */
    public final static int AFRIKAANS_LANGUAGE = 0;
    public final static int ALBANIAN_LANGUAGE = 1;
    public final static int ARABIC_LANGUAGE = 2;
    public final static int ARMENIAN_LANGUAGE = 3;
    public final static int AZERBAIJANI_LANGUAGE = 4;
    public final static int BASQUE_LANGUAGE = 5;
    public final static int BELARUSIAN_LANGUAGE = 6;
    public final static int BENGALI_LANGUAGE = 7;
    public final static int BOKMAL_LANGUAGE = 8;
    public final static int BOSNIAN_LANGUAGE = 9;
    public final static int BULGARIAN_LANGUAGE = 10;
    public final static int CATALAN_LANGUAGE = 11;
    public final static int CHINESE_LANGUAGE = 12;
    public final static int CROATIAN_LANGUAGE = 13;
    public final static int CZECH_LANGUAGE = 14;
    public final static int DANISH_LANGUAGE = 15;
    public final static int DUTCH_LANGUAGE = 16;
    public final static int ENGLISH_LANGUAGE = 17;
    public final static int ESPERANTO_LANGUAGE = 18;
    public final static int ESTONIAN_LANGUAGE = 19;
    public final static int FINNISH_LANGUAGE = 20;
    public final static int FRENCH_LANGUAGE = 21;
    public final static int GANDA_LANGUAGE = 22;
    public final static int GEORGIAN_LANGUAGE = 23;
    public final static int GERMAN_LANGUAGE = 24;
    public final static int GREEK_LANGUAGE = 25;
    public final static int GUJARATI_LANGUAGE = 26;
    public final static int HEBREW_LANGUAGE = 27;
    public final static int HINDI_LANGUAGE = 28;
    public final static int HUNGARIAN_LANGUAGE = 29;
    public final static int ICELANDIC_LANGUAGE = 30;
    public final static int INDONESIAN_LANGUAGE = 31;
    public final static int IRISH_LANGUAGE = 32;
    public final static int ITALIAN_LANGUAGE = 33;
    public final static int JAPANESE_LANGUAGE = 34;
    public final static int KAZAKH_LANGUAGE = 35;
    public final static int KOREAN_LANGUAGE = 36;
    public final static int LATVIAN_LANGUAGE = 37;
    public final static int LITHUANIAN_LANGUAGE = 38;
    public final static int MACEDONIAN_LANGUAGE = 39;
    public final static int MALAY_LANGUAGE = 40;
    public final static int MARATHI_LANGUAGE = 41;
    public final static int MONGOLIAN_LANGUAGE = 42;
    public final static int NYNORSK_LANGUAGE = 43;
    public final static int PERSIAN_LANGUAGE = 44;
    public final static int POLISH_LANGUAGE = 45;
    public final static int PORTUGUESE_LANGUAGE = 46;
    public final static int PUNJABI_LANGUAGE = 47;
    public final static int ROMANIAN_LANGUAGE = 48;
    public final static int RUSSIAN_LANGUAGE = 49;
    public final static int SERBIAN_LANGUAGE = 50;
    public final static int SHONA_LANGUAGE = 51;
    public final static int SLOVAK_LANGUAGE = 52;
    public final static int SLOVENE_LANGUAGE = 53;
    public final static int SOMALI_LANGUAGE = 54;
    public final static int SOTHO_LANGUAGE = 55;
    public final static int SPANISH_LANGUAGE = 56;
    public final static int SWAHILI_LANGUAGE = 57;
    public final static int SWEDISH_LANGUAGE = 58;
    public final static int TAGALOG_LANGUAGE = 59;
    public final static int TAMIL_LANGUAGE = 60;
    public final static int TELUGU_LANGUAGE = 61;
    public final static int THAI_LANGUAGE = 62;
    public final static int TSONGA_LANGUAGE = 63;// ----
    public final static int TSWANA_LANGUAGE = 64;// ----
    public final static int TURKISH_LANGUAGE = 65;
    public final static int UKRAINIAN_LANGUAGE = 66;
    public final static int URDU_LANGUAGE = 67;
    public final static int VIETNAMESE_LANGUAGE = 68;
    public final static int WELSH_LANGUAGE = 69;
    public final static int XHOSA_LANGUAGE = 70;
    public final static int YORUBA_LANGUAGE = 71;
    public final static int ZULU_LANGUAGE = 72;
    public final static int NORWEGIAN_LANGUAGE = 73;// We may have to remove this
    public final static int AMHARIC_LANGUAGE = 74;
    public final static int CEBUANO_LANGUAGE = 75;
    public final static int CORSICAN_LANGUAGE = 76;
    public final static int GALICIAN_LANGUAGE = 77;
    public final static int FRISIAN_LANGUAGE = 78;
    public final static int HAWAIIAN_LANGUAGE = 79;
    public final static int HAUSA_LANGUAGE = 80;
    public final static int HMONG_LANGUAGE = 81;
    public final static int IGBO_LANGUAGE = 82;
    public final static int KANNADA_LANGUAGE = 83;
    public final static int JAVANESE_LANGUAGE = 84;
    public final static int KHMER_LANGUAGE = 85;
    public final static int LATIN_LANGUAGE = 86;
    public final static int LAO_LANGUAGE = 87;
    public final static int KYRGYZ_LANGUAGE = 88;
    public final static int KURDISH_LANGUAGE = 89;
    public final static int LUXEMBOURGISH_LANGUAGE = 90;
    public final static int MAORI_LANGUAGE = 91;
    public final static int MALTESE_LANGUAGE = 92;
    public final static int MALAYALAM_LANGUAGE = 93;
    public final static int MALAGASY_LANGUAGE = 94;
    public final static int NEPALI_LANGUAGE = 95;
    public final static int MYANMAR_LANGUAGE = 96;
    public final static int PASHTO_LANGUAGE = 97;
    public final static int NYANJA_LANGUAGE = 98;
    public final static int SAMOAN_LANGUAGE = 99;
    public final static int SESOTHO_LANGUAGE = 100;
    public final static int SINHALA_LANGUAGE = 101;
    public final static int SINDHI_LANGUAGE = 102;
    public final static int SUNDANESE_LANGUAGE = 103;
    public final static int TAJIK_LANGUAGE = 104;
    public final static int UZBEK_LANGUAGE = 105;
    public final static int YIDDISH_LANGUAGE = 106;

    //Languages Text
    public final static String AFRIKAANS = "Afrikaans";
    public final static String ALBANIAN = "Albanian";
    public final static String ARABIC = "Arabic";
    public final static String ARMENIAN = "Armenian";
    public final static String AZERBAIJANI = "Azerbaijani";
    public final static String BASQUE = "Basque";
    public final static String BELARUSIAN = "Belarusian";
    public final static String BENGALI = "Bengali";
    public final static String BOKMAL = "Bokmal";
    public final static String BOSNIAN = "Bosnian";
    public final static String BULGARIAN = "Bulgarian";
    public final static String CATALAN = "Catalan";
    public final static String CHINESE = "Chinese";
    public final static String CROATIAN = "Croatian";
    public final static String CZECH = "Czech";
    public final static String DANISH = "Danish";
    public final static String DUTCH = "Dutch";
    public final static String ENGLISH = "English";
    public final static String ESPERANTO = "Esperanto";
    public final static String ESTONIAN = "Estonian";
    public final static String FINNISH = "Finnish";
    public final static String FRENCH = "French";
    public final static String GANDA = "Ganda";
    public final static String GEORGIAN = "Georgian";
    public final static String GERMAN = "German";
    public final static String GREEK = "Greek";
    public final static String GUJARATI = "Gujarati";
    public final static String HEBREW = "Hebrew";
    public final static String HINDI = "Hindi";
    public final static String HUNGARIAN = "Hungarian";
    public final static String ICELANDIC = "Icelandic";
    public final static String INDONESIAN = "Indonesian";
    public final static String IRISH = "Irish";
    public final static String ITALIAN = "Italian";
    public final static String JAPANESE = "Japanese";
    public final static String KAZAKH = "Kazakh";
    public final static String KOREAN = "Korean";
    public final static String LATVIAN = "Latvian";
    public final static String LITHUANIAN = "Lithuanian";
    public final static String MACEDONIAN = "Macedonian";
    public final static String MALAY = "Malay";
    public final static String MARATHI = "Marathi";
    public final static String MONGOLIAN = "Mongolian";
    public final static String NYNORSK = "Nynorsk";
    public final static String PERSIAN = "Persian";
    public final static String POLISH = "Polish";
    public final static String PORTUGUESE = "Portuguese";
    public final static String PUNJABI = "Punjabi";
    public final static String ROMANIAN = "Romanian";
    public final static String RUSSIAN = "Russian";
    public final static String SERBIAN = "Serbian";
    public final static String SHONA = "Shona";
    public final static String SLOVAK = "Slovak";
    public final static String SLOVENE = "Slovene";
    public final static String SOMALI = "Somali";
    public final static String SOTHO = "Sotho";
    public final static String SPANISH = "Spanish";
    public final static String SWAHILI = "Swahili";
    public final static String SWEDISH = "Swedish";
    public final static String TAGALOG = "Tagalog";
    public final static String TAMIL = "Tamil";
    public final static String TELUGU = "Telugu";
    public final static String THAI = "Thai";
    public final static String TSONGA = "Tsonga";
    public final static String TSWANA = "Tswana";
    public final static String TURKISH = "Turkish";
    public final static String UKRAINIAN = "Ukrainian";
    public final static String URDU = "Urdu";
    public final static String VIETNAMESE = "Vietnamese";
    public final static String WELSH = "Welsh";
    public final static String XHOSA = "Xhosa";
    public final static String YORUBA = "Yoruba";
    public final static String ZULU = "Zulu";
    public final static String NORWEGIAN = "Norwegian";


    //Language codes
    public final static String UNKNOWN_LANGUAGE_CODE = "unk";
    public final static String AFRIKAANS_LANGUAGE_CODE = "af-ZA";
    public final static String ALBANIAN_LANGUAGE_CODE = "sq-AL";
    public final static String ARABIC_LANGUAGE_CODE = "ar-AE"; //TODO implement all other arabic countries
    public final static String ARMENIAN_LANGUAGE_CODE = "hy-AM";
    public final static String AZERBAIJANI_LANGUAGE_CODE = "az-AZ";
    public final static String BASQUE_LANGUAGE_CODE = "eu-ES";
    public final static String BELARUSIAN_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String BENGALI_LANGUAGE_CODE = "bn-BD";
    public final static String BOKMAL_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String BOSNIAN_LANGUAGE_CODE = "bs-BA";
    public final static String BULGARIAN_LANGUAGE_CODE = "bg-BG";
    public final static String CATALAN_LANGUAGE_CODE = "ca-ES";
    public final static String CHINESE_LANGUAGE_CODE = "zh";
    public final static String CROATIAN_LANGUAGE_CODE = "hr-HR";
    public final static String CZECH_LANGUAGE_CODE = "cs-CZ";
    public final static String DANISH_LANGUAGE_CODE = "da-DK";
    public final static String DUTCH_LANGUAGE_CODE = "nl-NL";
    public final static String ENGLISH_LANGUAGE_CODE = "en_US";
    public final static String ESPERANTO_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String ESTONIAN_LANGUAGE_CODE = "et-EE";
    public final static String FINNISH_LANGUAGE_CODE = "fi-FI";
    public final static String FRENCH_LANGUAGE_CODE = "fr-FR";
    public final static String GANDA_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String GEORGIAN_LANGUAGE_CODE = "ka-GE";
    public final static String GERMAN_LANGUAGE_CODE = "de-DE";
    public final static String GREEK_LANGUAGE_CODE = "el-GR";
    public final static String GUJARATI_LANGUAGE_CODE = "gu-IN";
    public final static String HEBREW_LANGUAGE_CODE = "iw-IL";
    public final static String HINDI_LANGUAGE_CODE = "hi-IN";
    public final static String HUNGARIAN_LANGUAGE_CODE = "hu-HU";
    public final static String ICELANDIC_LANGUAGE_CODE = "is-IS";
    public final static String INDONESIAN_LANGUAGE_CODE = "id-ID";
    public final static String IRISH_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String ITALIAN_LANGUAGE_CODE = "it-IT";
    public final static String JAPANESE_LANGUAGE_CODE = "ja-JP";
    public final static String KAZAKH_LANGUAGE_CODE = "kk-KZ";
    public final static String KOREAN_LANGUAGE_CODE = "ko-KR";
    public final static String LATVIAN_LANGUAGE_CODE = "lv-LV";
    public final static String LITHUANIAN_LANGUAGE_CODE = "lt-LT";
    public final static String MACEDONIAN_LANGUAGE_CODE = "mk-MK";
    public final static String MALAY_LANGUAGE_CODE = "ms-MY";
    public final static String MARATHI_LANGUAGE_CODE = "mr-IN";
    public final static String MONGOLIAN_LANGUAGE_CODE = "mn-MN";
    public final static String NYNORSK_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String PERSIAN_LANGUAGE_CODE = "fa-IR";
    public final static String POLISH_LANGUAGE_CODE = "pl-PL";
    public final static String PORTUGUESE_LANGUAGE_CODE = "pt-PT";
    public final static String PUNJABI_LANGUAGE_CODE = "pa-Guru-IN";
    public final static String ROMANIAN_LANGUAGE_CODE = "ro-RO";
    public final static String RUSSIAN_LANGUAGE_CODE = "ru-RU";
    public final static String SERBIAN_LANGUAGE_CODE = "sr-RS";
    public final static String SHONA_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String SLOVAK_LANGUAGE_CODE = "sk-SK";
    public final static String SLOVENE_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String SOMALI_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String SOTHO_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String SPANISH_LANGUAGE_CODE = "es-ES";
    public final static String SWAHILI_LANGUAGE_CODE = "sw-KE";
    public final static String SWEDISH_LANGUAGE_CODE = "sv-SE";
    public final static String TAGALOG_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String TAMIL_LANGUAGE_CODE = "ta-IN";
    public final static String TELUGU_LANGUAGE_CODE = "te-IN";
    public final static String THAI_LANGUAGE_CODE = "th-TH";
    public final static String TSONGA_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String TSWANA_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String TURKISH_LANGUAGE_CODE = "tr-TR";
    public final static String UKRAINIAN_LANGUAGE_CODE = "uk-UA";
    public final static String URDU_LANGUAGE_CODE = "ur-PK";
    public final static String VIETNAMESE_LANGUAGE_CODE = "vi-VN";
    public final static String WELSH_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String XHOSA_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String YORUBA_LANGUAGE_CODE = UNKNOWN_LANGUAGE_CODE;
    public final static String ZULU_LANGUAGE_CODE = "zu-ZA";
    public final static String NORWEGIAN_LANGUAGE_CODE = "no-NO";

    //Flags by Country
    public final static int AFRIKAANS_LANGUAGE_FLAG = R.drawable.af;
    public final static int ALBANIAN_LANGUAGE_FLAG = R.drawable.al;
    public final static int ARABIC_LANGUAGE_FLAG = R.drawable.ar;
    public final static int ARMENIAN_LANGUAGE_FLAG = R.drawable.hy;
    public final static int AZERBAIJANI_LANGUAGE_FLAG = R.drawable.az;
    public final static int BASQUE_LANGUAGE_FLAG = R.drawable.eu;
    public final static int BELARUSIAN_LANGUAGE_FLAG = R.drawable.by;
    public final static int BENGALI_LANGUAGE_FLAG = R.drawable.bn;
    public final static int BOKMAL_LANGUAGE_FLAG = R.drawable.no;
    public final static int BOSNIAN_LANGUAGE_FLAG = R.drawable.bs;
    public final static int BULGARIAN_LANGUAGE_FLAG = R.drawable.bg;
    public final static int CATALAN_LANGUAGE_FLAG = R.drawable.ca;
    public final static int CHINESE_LANGUAGE_FLAG = R.drawable.cn;
    public final static int CROATIAN_LANGUAGE_FLAG = R.drawable.hr;
    public final static int CZECH_LANGUAGE_FLAG = R.drawable.cz;
    public final static int DANISH_LANGUAGE_FLAG = R.drawable.da;
    public final static int DUTCH_LANGUAGE_FLAG = R.drawable.nl;
    public final static int ENGLISH_LANGUAGE_FLAG = R.drawable.gb;
    public final static int ESPERANTO_LANGUAGE_FLAG = R.drawable.eo;
    public final static int ESTONIAN_LANGUAGE_FLAG = R.drawable.et;
    public final static int FINNISH_LANGUAGE_FLAG = R.drawable.fi;
    public final static int FRENCH_LANGUAGE_FLAG = R.drawable.fr;
    public final static int GANDA_LANGUAGE_FLAG = R.drawable.lg;
    public final static int GEORGIAN_LANGUAGE_FLAG = R.drawable.ka;
    public final static int GERMAN_LANGUAGE_FLAG = R.drawable.de;
    public final static int GREEK_LANGUAGE_FLAG = R.drawable.gr;
    public final static int GUJARATI_LANGUAGE_FLAG = R.drawable.gu;
    public final static int HEBREW_LANGUAGE_FLAG = R.drawable.iw;
    public final static int HINDI_LANGUAGE_FLAG = R.drawable.hi;
    public final static int HUNGARIAN_LANGUAGE_FLAG = R.drawable.hu;
    public final static int ICELANDIC_LANGUAGE_FLAG = R.drawable.is;
    public final static int INDONESIAN_LANGUAGE_FLAG = R.drawable.id;
    public final static int IRISH_LANGUAGE_FLAG = R.drawable.ga;
    public final static int ITALIAN_LANGUAGE_FLAG = R.drawable.it;
    public final static int JAPANESE_LANGUAGE_FLAG = R.drawable.ja;
    public final static int KAZAKH_LANGUAGE_FLAG = R.drawable.kk;
    public final static int KOREAN_LANGUAGE_FLAG = R.drawable.ko;
    public final static int LATVIAN_LANGUAGE_FLAG = R.drawable.lv;
    public final static int LITHUANIAN_LANGUAGE_FLAG = R.drawable.lt;
    public final static int MACEDONIAN_LANGUAGE_FLAG = R.drawable.mk;
    public final static int MALAY_LANGUAGE_FLAG = R.drawable.ms;
    public final static int MARATHI_LANGUAGE_FLAG = R.drawable.mr;
    public final static int MONGOLIAN_LANGUAGE_FLAG = R.drawable.mn;
    public final static int NYNORSK_LANGUAGE_FLAG = R.drawable.no;
    public final static int PERSIAN_LANGUAGE_FLAG = R.drawable.fa;
    public final static int POLISH_LANGUAGE_FLAG = R.drawable.pl;
    public final static int PORTUGUESE_LANGUAGE_FLAG = R.drawable.pt;
    public final static int PUNJABI_LANGUAGE_FLAG = R.drawable.pa;
    public final static int ROMANIAN_LANGUAGE_FLAG = R.drawable.ro;
    public final static int RUSSIAN_LANGUAGE_FLAG = R.drawable.ru;
    public final static int SERBIAN_LANGUAGE_FLAG = R.drawable.sr;
    public final static int SHONA_LANGUAGE_FLAG = R.drawable.sn;
    public final static int SLOVAK_LANGUAGE_FLAG = R.drawable.sk;
    public final static int SLOVENE_LANGUAGE_FLAG = R.drawable.sl;
    public final static int SOMALI_LANGUAGE_FLAG = R.drawable.so;
    public final static int SOTHO_LANGUAGE_FLAG = R.drawable.st;
    public final static int SPANISH_LANGUAGE_FLAG = R.drawable.es;
    public final static int SWAHILI_LANGUAGE_FLAG = R.drawable.sw;
    public final static int SWEDISH_LANGUAGE_FLAG = R.drawable.sv;
    public final static int TAGALOG_LANGUAGE_FLAG = R.drawable.tl;
    public final static int TAMIL_LANGUAGE_FLAG = R.drawable.ta;
    public final static int TELUGU_LANGUAGE_FLAG = R.drawable.te;
    public final static int THAI_LANGUAGE_FLAG = R.drawable.th;
    public final static int TSONGA_LANGUAGE_FLAG = R.drawable.ts;
    public final static int TSWANA_LANGUAGE_FLAG = R.drawable.tn;
    public final static int TURKISH_LANGUAGE_FLAG = R.drawable.tr;
    public final static int UKRAINIAN_LANGUAGE_FLAG = R.drawable.ua;
    public final static int URDU_LANGUAGE_FLAG = R.drawable.pk;
    public final static int VIETNAMESE_LANGUAGE_FLAG = R.drawable.vi;
    public final static int WELSH_LANGUAGE_FLAG = R.drawable.cy;
    public final static int XHOSA_LANGUAGE_FLAG = R.drawable.xh;
    public final static int YORUBA_LANGUAGE_FLAG = R.drawable.yo;
    public final static int ZULU_LANGUAGE_FLAG = R.drawable.zu;
    public final static int NORWEGIAN_LANGUAGE_FLAG = R.drawable.no;

    public final static int AMHARIC_LANGUAGE_FLAG = R.drawable.am;
    public final static int CEBUANO_LANGUAGE_FLAG = R.drawable.ce;
    public final static int CORSICAN_LANGUAGE_FLAG = R.drawable.co;
    public final static int GALICIAN_LANGUAGE_FLAG = R.drawable.gl;
    public final static int FRISIAN_LANGUAGE_FLAG = R.drawable.fy;
    public final static int HAWAIIAN_LANGUAGE_FLAG = R.drawable.hw;
    public final static int HAUSA_LANGUAGE_FLAG = R.drawable.ha;
    public final static int HMONG_LANGUAGE_FLAG = R.drawable.hm;
    public final static int IGBO_LANGUAGE_FLAG = R.drawable.ig;
    public final static int KANNADA_LANGUAGE_FLAG = R.drawable.kn;
    public final static int JAVANESE_LANGUAGE_FLAG = R.drawable.jv;
    public final static int KHMER_LANGUAGE_FLAG = R.drawable.km;
    public final static int LATIN_LANGUAGE_FLAG = R.drawable.ln;
    public final static int LAO_LANGUAGE_FLAG = R.drawable.lo;
    public final static int KYRGYZ_LANGUAGE_FLAG = R.drawable.ky;
    public final static int KURDISH_LANGUAGE_FLAG = R.drawable.ku;
    public final static int LUXEMBOURGISH_LANGUAGE_FLAG = R.drawable.lb;
    public final static int MAORI_LANGUAGE_FLAG = R.drawable.mi;
    public final static int MALTESE_LANGUAGE_FLAG = R.drawable.mt;
    public final static int MALAYALAM_LANGUAGE_FLAG = R.drawable.ml;
    public final static int MALAGASY_LANGUAGE_FLAG = R.drawable.mg;
    public final static int NEPALI_LANGUAGE_FLAG = R.drawable.ne;
    public final static int MYANMAR_LANGUAGE_FLAG = R.drawable.my;
    public final static int PASHTO_LANGUAGE_FLAG = R.drawable.ps;
    public final static int NYANJA_LANGUAGE_FLAG = R.drawable.ny;
    public final static int SAMOAN_LANGUAGE_FLAG = R.drawable.sm;
    public final static int SESOTHO_LANGUAGE_FLAG = R.drawable.sx;
    public final static int SINHALA_LANGUAGE_FLAG = R.drawable.si;
    public final static int SINDHI_LANGUAGE_FLAG = R.drawable.sd;
    public final static int SUNDANESE_LANGUAGE_FLAG = R.drawable.su;
    public final static int TAJIK_LANGUAGE_FLAG = R.drawable.tg;
    public final static int UZBEK_LANGUAGE_FLAG = R.drawable.uz;
    public final static int YIDDISH_LANGUAGE_FLAG = R.drawable.yi;


 
    public final static String OCR_BLACKLIST = "!@#¦$¶¿ØÞ÷ÉÿǁñȻȼǂǝðþæÊ×ÐÇÀÈÆ¹Á½" +
            "¼º»¾¸·¯´²±³¨®%^¬`¥&*()\"ɍ√¤˜_)¢∞≡≈↔⇔≠=“…Ãª«∫∮+~:]°€}‘[{'\\|,<.>/;?§ΐ©΄’-";

    public final static String OCR_GREEK_WHITELIST = "ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩαβγδεζηθικλμνξοπρσςτυφχψωάέήίόύώ";
    public final static String OCR_ENGLISH_WHITELIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-—";

    public final static String OCR_NUMBERS = "0123456789";


    public final static ArrayList<Integer> ML_OCR_AVAILABLE_LANGUAGES = new ArrayList<>(Arrays.asList(
            ENGLISH_LANGUAGE,
            SPANISH_LANGUAGE,
            CATALAN_LANGUAGE,
            DANISH_LANGUAGE,
            DUTCH_LANGUAGE,
            FINNISH_LANGUAGE,
            FRENCH_LANGUAGE,
            GERMAN_LANGUAGE,
            HUNGARIAN_LANGUAGE,
            NORWEGIAN_LANGUAGE,
            POLISH_LANGUAGE,
            ROMANIAN_LANGUAGE,
            SWEDISH_LANGUAGE,
            TAGALOG_LANGUAGE,
            TURKISH_LANGUAGE
    ));

    public final static ArrayList<Integer> textColorList = new ArrayList<>(Arrays.asList(
            R.color.blue_main_light,
            R.color.red_lightest,
            R.color.cyan_light,
            R.color.pink_extra_light,
            R.color.brown_lighter,
            R.color.yellow_light,
            R.color.brown_light,
            R.color.header_red_light,
            R.color.pink_light,
            R.color.blue_light
    ));

    public static ArrayList<LanguageItem> getLanguages()
    {
        ArrayList<LanguageItem> list = new ArrayList<>();

        list.add(new LanguageItem("Afrikaans","af",AFRIKAANS_LANGUAGE_CODE,AFRIKAANS_LANGUAGE,AFRIKAANS_LANGUAGE_FLAG));
        list.add(new LanguageItem("Albanian","sq",ALBANIAN_LANGUAGE_CODE,ALBANIAN_LANGUAGE,ALBANIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Amharic","am",UNKNOWN_LANGUAGE_CODE,AMHARIC_LANGUAGE,AMHARIC_LANGUAGE_FLAG));
        list.add(new LanguageItem("Arabic","ar",ARABIC_LANGUAGE_CODE,ARABIC_LANGUAGE,ARABIC_LANGUAGE_FLAG));
        list.add(new LanguageItem("Armenian","hy",ARMENIAN_LANGUAGE_CODE,ARMENIAN_LANGUAGE,ARMENIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Azerbaijani","az",AZERBAIJANI_LANGUAGE_CODE,AZERBAIJANI_LANGUAGE,AZERBAIJANI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Basque","eu",BASQUE_LANGUAGE_CODE,BASQUE_LANGUAGE,BASQUE_LANGUAGE_FLAG));
        list.add(new LanguageItem("Belarusian","be",BELARUSIAN_LANGUAGE_CODE,BELARUSIAN_LANGUAGE,BELARUSIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Bengali","bn",BENGALI_LANGUAGE_CODE,BENGALI_LANGUAGE,BENGALI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Bosnian","bs",BOSNIAN_LANGUAGE_CODE,BOSNIAN_LANGUAGE,BOSNIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Bulgarian","bg",BULGARIAN_LANGUAGE_CODE,BULGARIAN_LANGUAGE,BULGARIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Catalan","ca",CATALAN_LANGUAGE_CODE,CATALAN_LANGUAGE,CATALAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Cebuano","ceb",UNKNOWN_LANGUAGE_CODE,CEBUANO_LANGUAGE,CEBUANO_LANGUAGE_FLAG));
        list.add(new LanguageItem("Chinese","zh",CHINESE_LANGUAGE_CODE,CHINESE_LANGUAGE,CHINESE_LANGUAGE_FLAG));
        list.add(new LanguageItem("Corsican","co",UNKNOWN_LANGUAGE_CODE,CORSICAN_LANGUAGE,CORSICAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Croatian","hr",CROATIAN_LANGUAGE_CODE,CROATIAN_LANGUAGE,CROATIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Czech","cs",CZECH_LANGUAGE_CODE,CZECH_LANGUAGE,CZECH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Danish","da",DANISH_LANGUAGE_CODE,DANISH_LANGUAGE,DANISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Dutch","nl",DUTCH_LANGUAGE_CODE,DUTCH_LANGUAGE,DUTCH_LANGUAGE_FLAG));
        list.add(new LanguageItem("English","en",ENGLISH_LANGUAGE_CODE,ENGLISH_LANGUAGE,ENGLISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Esperanto","eo",ESPERANTO_LANGUAGE_CODE,ESPERANTO_LANGUAGE,ESPERANTO_LANGUAGE_FLAG));
        list.add(new LanguageItem("Estonian","et",ESTONIAN_LANGUAGE_CODE,ESTONIAN_LANGUAGE,ESTONIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Finnish","fi",FINNISH_LANGUAGE_CODE,FINNISH_LANGUAGE,FINNISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("French","fr",FRENCH_LANGUAGE_CODE,FRENCH_LANGUAGE,FRENCH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Frisian","fy",UNKNOWN_LANGUAGE_CODE,FRISIAN_LANGUAGE,FRISIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Galician","gl",UNKNOWN_LANGUAGE_CODE,GALICIAN_LANGUAGE,GALICIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Georgian","ka",GEORGIAN_LANGUAGE_CODE,GEORGIAN_LANGUAGE,GEORGIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("German","de",GERMAN_LANGUAGE_CODE,GERMAN_LANGUAGE,GERMAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Greek","el",GREEK_LANGUAGE_CODE,GREEK_LANGUAGE,GREEK_LANGUAGE_FLAG));
        list.add(new LanguageItem("Gujarati","gu",GUJARATI_LANGUAGE_CODE,GUJARATI_LANGUAGE,GUJARATI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Hausa","ha",UNKNOWN_LANGUAGE_CODE,HAUSA_LANGUAGE,HAUSA_LANGUAGE_FLAG));
        list.add(new LanguageItem("Hawaiian","haw",UNKNOWN_LANGUAGE_CODE,HAWAIIAN_LANGUAGE,HAWAIIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Hebrew","he",HEBREW_LANGUAGE_CODE,HEBREW_LANGUAGE,HEBREW_LANGUAGE_FLAG));
        list.add(new LanguageItem("Hindi","hi",HINDI_LANGUAGE_CODE,HINDI_LANGUAGE,HINDI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Hmong","hmn",UNKNOWN_LANGUAGE_CODE,HMONG_LANGUAGE,HMONG_LANGUAGE_FLAG));
        list.add(new LanguageItem("Hungarian","hu",HUNGARIAN_LANGUAGE_CODE,HUNGARIAN_LANGUAGE,HUNGARIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Icelandic","is",ICELANDIC_LANGUAGE_CODE,ICELANDIC_LANGUAGE,ICELANDIC_LANGUAGE_FLAG));
        list.add(new LanguageItem("Igbo","ig",UNKNOWN_LANGUAGE_CODE,IGBO_LANGUAGE,IGBO_LANGUAGE_FLAG));
        list.add(new LanguageItem("Indonesian","id",INDONESIAN_LANGUAGE_CODE,INDONESIAN_LANGUAGE,INDONESIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Irish","ga",IRISH_LANGUAGE_CODE,IRISH_LANGUAGE,IRISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Italian","it",ITALIAN_LANGUAGE_CODE,ITALIAN_LANGUAGE,ITALIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Japanese","ja",JAPANESE_LANGUAGE_CODE,JAPANESE_LANGUAGE,JAPANESE_LANGUAGE_FLAG));
        list.add(new LanguageItem("Javanese","jv",UNKNOWN_LANGUAGE_CODE,JAVANESE_LANGUAGE,JAVANESE_LANGUAGE_FLAG));
        list.add(new LanguageItem("Kannada","kn",UNKNOWN_LANGUAGE_CODE,KANNADA_LANGUAGE,KANNADA_LANGUAGE_FLAG));
        list.add(new LanguageItem("Kazakh","kk",KAZAKH_LANGUAGE_CODE,KAZAKH_LANGUAGE,KAZAKH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Khmer","km",UNKNOWN_LANGUAGE_CODE,KHMER_LANGUAGE,KHMER_LANGUAGE_FLAG));
        list.add(new LanguageItem("Korean","ko",KOREAN_LANGUAGE_CODE,KOREAN_LANGUAGE,KOREAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Kurdish","ku",UNKNOWN_LANGUAGE_CODE,KURDISH_LANGUAGE,KURDISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Kyrgyz","ky",UNKNOWN_LANGUAGE_CODE,KYRGYZ_LANGUAGE,KYRGYZ_LANGUAGE_FLAG));
        list.add(new LanguageItem("Lao","lo",UNKNOWN_LANGUAGE_CODE,LAO_LANGUAGE,LAO_LANGUAGE_FLAG));
        list.add(new LanguageItem("Latin","la",UNKNOWN_LANGUAGE_CODE,LATIN_LANGUAGE,LATIN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Latvian","lv",LATVIAN_LANGUAGE_CODE,LATVIAN_LANGUAGE,LATVIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Lithuanian","lt",LITHUANIAN_LANGUAGE_CODE,LITHUANIAN_LANGUAGE,LITHUANIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Luxembourgish","lb",UNKNOWN_LANGUAGE_CODE,LUXEMBOURGISH_LANGUAGE,LUXEMBOURGISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Macedonian","mk",MACEDONIAN_LANGUAGE_CODE,MACEDONIAN_LANGUAGE,MACEDONIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Malagasy","mg",UNKNOWN_LANGUAGE_CODE,MALAGASY_LANGUAGE,MALAGASY_LANGUAGE_FLAG));
        list.add(new LanguageItem("Malay","ms",MALAY_LANGUAGE_CODE,MALAY_LANGUAGE,MALAY_LANGUAGE_FLAG));
        list.add(new LanguageItem("Malayalam","ml",UNKNOWN_LANGUAGE_CODE,MALAYALAM_LANGUAGE,MALAYALAM_LANGUAGE_FLAG));
        list.add(new LanguageItem("Maltese","mt",UNKNOWN_LANGUAGE_CODE,MALTESE_LANGUAGE,MALTESE_LANGUAGE_FLAG));
        list.add(new LanguageItem("Maori","mi",UNKNOWN_LANGUAGE_CODE,MAORI_LANGUAGE,MAORI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Marathi","mr",MARATHI_LANGUAGE_CODE,MARATHI_LANGUAGE,MARATHI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Mongolian","mn",MONGOLIAN_LANGUAGE_CODE,MONGOLIAN_LANGUAGE,MONGOLIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Myanmar","my",UNKNOWN_LANGUAGE_CODE,MYANMAR_LANGUAGE,MYANMAR_LANGUAGE_FLAG));
        list.add(new LanguageItem("Nepali","ne",UNKNOWN_LANGUAGE_CODE,NEPALI_LANGUAGE,NEPALI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Norwegian (Bokmal)",UNKNOWN_LANGUAGE_CODE,"no",BOKMAL_LANGUAGE,NORWEGIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Norwegian (Nynorsk)",UNKNOWN_LANGUAGE_CODE,"no",NYNORSK_LANGUAGE,NORWEGIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Nyanja","ny",UNKNOWN_LANGUAGE_CODE,NYANJA_LANGUAGE,NYANJA_LANGUAGE_FLAG));
        list.add(new LanguageItem("Pashto","ps",UNKNOWN_LANGUAGE_CODE,PASHTO_LANGUAGE,PASHTO_LANGUAGE_FLAG));
        list.add(new LanguageItem("Persian","fa",PERSIAN_LANGUAGE_CODE,PERSIAN_LANGUAGE,PERSIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Polish","pl",POLISH_LANGUAGE_CODE,POLISH_LANGUAGE,POLISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Portuguese","pt",PORTUGUESE_LANGUAGE_CODE,PORTUGUESE_LANGUAGE,PORTUGUESE_LANGUAGE_FLAG));
        list.add(new LanguageItem("Punjabi","pa",PUNJABI_LANGUAGE_CODE,PUNJABI_LANGUAGE,PUNJABI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Romanian","ro",ROMANIAN_LANGUAGE_CODE,ROMANIAN_LANGUAGE,ROMANIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Russian","ru",RUSSIAN_LANGUAGE_CODE,RUSSIAN_LANGUAGE,RUSSIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Samoan","sm",UNKNOWN_LANGUAGE_CODE,SAMOAN_LANGUAGE,SAMOAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Serbian","sr",SERBIAN_LANGUAGE_CODE,SERBIAN_LANGUAGE,SERBIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Sesotho","st",UNKNOWN_LANGUAGE_CODE,SESOTHO_LANGUAGE,SESOTHO_LANGUAGE_FLAG));
        list.add(new LanguageItem("Shona","sn",SHONA_LANGUAGE_CODE,SHONA_LANGUAGE,SHONA_LANGUAGE_FLAG));
        list.add(new LanguageItem("Sindhi","sd",UNKNOWN_LANGUAGE_CODE,SINDHI_LANGUAGE,SINDHI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Sinhala","si",UNKNOWN_LANGUAGE_CODE,SINHALA_LANGUAGE,SINHALA_LANGUAGE_FLAG));
        list.add(new LanguageItem("Slovak","sk",SLOVAK_LANGUAGE_CODE,SLOVAK_LANGUAGE,SLOVAK_LANGUAGE_FLAG));
        list.add(new LanguageItem("Slovenian","sl",SLOVENE_LANGUAGE_CODE,SLOVENE_LANGUAGE,SLOVENE_LANGUAGE_FLAG));
        list.add(new LanguageItem("Somali","so",SOMALI_LANGUAGE_CODE,SOMALI_LANGUAGE,SOMALI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Spanish","es",SPANISH_LANGUAGE_CODE,SPANISH_LANGUAGE,SPANISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Sundanese","su",UNKNOWN_LANGUAGE_CODE,SUNDANESE_LANGUAGE,SUNDANESE_LANGUAGE_FLAG));
        list.add(new LanguageItem("Swahili","sw",SWAHILI_LANGUAGE_CODE,SWAHILI_LANGUAGE,SWAHILI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Swedish","sv",SWEDISH_LANGUAGE_CODE,SWEDISH_LANGUAGE,SWEDISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Tagalog","tl",TAGALOG_LANGUAGE_CODE,TAGALOG_LANGUAGE,TAGALOG_LANGUAGE_FLAG));
        list.add(new LanguageItem("Tajik","tg",UNKNOWN_LANGUAGE_CODE,TAJIK_LANGUAGE,TAJIK_LANGUAGE_FLAG));
        list.add(new LanguageItem("Tamil","ta",TAMIL_LANGUAGE_CODE,TAMIL_LANGUAGE,TAMIL_LANGUAGE_FLAG));
        list.add(new LanguageItem("Telugu","te",TELUGU_LANGUAGE_CODE,TELUGU_LANGUAGE,TELUGU_LANGUAGE_FLAG));
        list.add(new LanguageItem("Thai","th",THAI_LANGUAGE_CODE,THAI_LANGUAGE,THAI_LANGUAGE_FLAG));
        list.add(new LanguageItem("Turkish","tr",TURKISH_LANGUAGE_CODE,TURKISH_LANGUAGE,TURKISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Ukrainian","uk",UKRAINIAN_LANGUAGE_CODE,UKRAINIAN_LANGUAGE,UKRAINIAN_LANGUAGE_FLAG));
        list.add(new LanguageItem("Urdu","ur",URDU_LANGUAGE_CODE,URDU_LANGUAGE,URDU_LANGUAGE_FLAG));
        list.add(new LanguageItem("Uzbek","uz",UNKNOWN_LANGUAGE_CODE,UZBEK_LANGUAGE,UZBEK_LANGUAGE_FLAG));
        list.add(new LanguageItem("Vietnamese","vi",VIETNAMESE_LANGUAGE_CODE,VIETNAMESE_LANGUAGE,VIETNAMESE_LANGUAGE_FLAG));
        list.add(new LanguageItem("Welsh","cy",WELSH_LANGUAGE_CODE,WELSH_LANGUAGE,WELSH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Xhosa","xh",XHOSA_LANGUAGE_CODE,XHOSA_LANGUAGE,XHOSA_LANGUAGE_FLAG));
        list.add(new LanguageItem("Yiddish","yi",YORUBA_LANGUAGE_CODE,YIDDISH_LANGUAGE,YIDDISH_LANGUAGE_FLAG));
        list.add(new LanguageItem("Yoruba","yo",UNKNOWN_LANGUAGE_CODE,YORUBA_LANGUAGE,YORUBA_LANGUAGE_FLAG));
        list.add(new LanguageItem("Zulu","zu",ZULU_LANGUAGE_CODE,ZULU_LANGUAGE,ZULU_LANGUAGE_FLAG));

        return list;
    }

}
