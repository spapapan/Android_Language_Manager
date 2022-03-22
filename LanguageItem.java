package com.app.babyapp.model.main;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.app.babyapp.data.LanguagesData;
import com.app.babyapp.shortcuts.S;
import com.app.babyapp.utils.Print;
import java.util.ArrayList;
import java.util.Locale;

/**
 *   Manage Application local Language
 */

public class LanguageItem {

    public String name;
    public String code;
    public String VRCode; //This is used for Voice Recognition API
    public int indexID;
    public int flag;

    //Finals
    public final static int MAIN_APP_LANGUAGE = LanguagesData.ENGLISH_LANGUAGE;
    public final static String MAIN_APP_VR_LANGUAGE_CODE = LanguagesData.ENGLISH_LANGUAGE_CODE;
    public final static int MAIN_APP_LANGUAGE_LIST_INDEX = 19;

    public LanguageItem(String name, String code, String VRCode, int indexID, int flag)
    {
        this.name = name;
        this.code = code;
        this.VRCode=VRCode;
        this.indexID=indexID;
        this.flag=flag;
    }

    /**
     * Change the LOCALE language for the entire application
     *
     * @param activity
     * @param langCode
     */
    public static void setAppLanguage(Activity activity, String langCode)
    {
        Locale myLocale = new Locale(langCode);
        Resources res = activity.getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
    }

    /**
     * Given the indexID get LanguageItem
     *
     * @param indexID
     * @return
     */
    private static LanguageItem get(int indexID)
    {
        ArrayList<LanguageItem> langList = LanguagesData.getLanguages();
        for (LanguageItem lang : langList){
            if (lang.indexID==indexID)
                return lang;
        }

        Print.e("We couldn't find LanguageItem for Language with indexID: " + indexID);
        return LanguagesData.getLanguages().get(MAIN_APP_LANGUAGE_LIST_INDEX);
    }

    /**
     * Given the indexID get the Language Code e.x. "en"
     *
     * @param indexID
     * @return
     */
    public static String getName(int indexID)
    {
        return get(indexID).name;
    }

    /**
     * Given the indexID get the Language Code e.x. "en"
     *
     * @param indexID
     * @return
     */
    public static String getCode(int indexID)
    {
        return get(indexID).code;
    }

    /**
     * Get the LanguageItem by using as an index
     * the position of the list LanguagesData.getLanguages())
     *
     * @param listPosition
     * @return
     */
    public static LanguageItem getLanguageByPosition(int listPosition)
    {
        return LanguagesData.getLanguages().get(listPosition);
    }

    /**
     * Given the indexID get the Language Voice Recognition Code e.x. "el-GR"
     *
     * @param indexID
     * @return
     */
    public static String getVRCode(int indexID)
    {
        return get(indexID).VRCode;
    }

    /**
     * Given the indexID get the drawable file of the Language Flag
     *
     * @param indexID
     * @return
     */
    public static Drawable getFlag(Context context, int indexID)
    {
        return S.d(context,get(indexID).flag);
    }

    /**
     * Given the indexID return the position at which the indexID
     * is located inside LanguagesData.getLanguages()).
     *
     * This method is used by activity.showFiltersSelection which request a
     * String list as an input and also a pointer at which the item
     * is currently selected in that list.
     *
     * @param indexID
     * @return
     */
    public static Integer getListPositionByIndex(int indexID)
    {
        int index=0;
        for (LanguageItem item : LanguagesData.getLanguages())
        {
            if (item.indexID==indexID)
                return index;
            index++;
        }

        Print.e("We couldn't find LanguageItem for Language with indexID: " + indexID);
        return MAIN_APP_LANGUAGE_LIST_INDEX;
    }

    /**
     * List with the names of all languages from
     * LanguagesData.getLanguages())
     *
     * @return
     */
    public static ArrayList<String> getLanguagesNames()
    {
        ArrayList<String> list = new ArrayList<>();
        for (LanguageItem item : LanguagesData.getLanguages())
            list.add(item.name);
        return list;
    }

    public static ArrayList<NameCodePair> getLanguages()
    {
        ArrayList<NameCodePair> list = new ArrayList<>();
        list.add(new NameCodePair("Chinese","zh"));
        list.add(new NameCodePair("Hindi","hi"));
        list.add(new NameCodePair("Spanish","es"));
        list.add(new NameCodePair("Arabic","ar"));
        list.add(new NameCodePair("Amharic","am"));
        list.add(new NameCodePair("Malay","ms"));
        list.add(new NameCodePair("Russian","ru"));
        list.add(new NameCodePair("Bengali","bn"));
        list.add(new NameCodePair("Portuguese","pt"));
        list.add(new NameCodePair("French","fr"));
        list.add(new NameCodePair("Japanese","ja"));
        list.add(new NameCodePair("Javanese","jv"));
        list.add(new NameCodePair("Korean","ko"));
        list.add(new NameCodePair("Telugu","te"));
        list.add(new NameCodePair("Tamil","ta"));
        list.add(new NameCodePair("German","de"));
        list.add(new NameCodePair("Vietnamese","vi"));
        list.add(new NameCodePair("English","en"));
        list.add(new NameCodePair("Urdu","ur"));
        list.add(new NameCodePair("Uzbek","uz"));
        list.add(new NameCodePair("Afrikaans","af"));
        list.add(new NameCodePair("Albanian","sq"));
        list.add(new NameCodePair("Armenian","hy"));
        list.add(new NameCodePair("Azerbaijani","az"));
        list.add(new NameCodePair("Basque","eu"));
        list.add(new NameCodePair("Greek","el"));
        list.add(new NameCodePair("Belarusian","be"));
        list.add(new NameCodePair("Bosnian","bs"));
        list.add(new NameCodePair("Bulgarian","bg"));
        list.add(new NameCodePair("Catalan","ca"));
        list.add(new NameCodePair("Cebuano","ceb"));
        list.add(new NameCodePair("Frisian","fy"));
        list.add(new NameCodePair("Finnish","fi"));
        list.add(new NameCodePair("Estonian","et"));
        list.add(new NameCodePair("Esperanto","eo"));
        list.add(new NameCodePair("Dutch","nl"));
        list.add(new NameCodePair("Danish","da"));
        list.add(new NameCodePair("Czech","cs"));
        list.add(new NameCodePair("Croatian","hr"));
        list.add(new NameCodePair("Corsican","co"));
        list.add(new NameCodePair("Galician","gl"));
        list.add(new NameCodePair("Georgian","ka"));
        list.add(new NameCodePair("Gujarati","gu"));
        list.add(new NameCodePair("Hausa","ha"));
        list.add(new NameCodePair("Hawaiian","haw"));
        list.add(new NameCodePair("Polish","pl"));
        list.add(new NameCodePair("Hebrew","he"));
        list.add(new NameCodePair("Hmong","hmn"));
        list.add(new NameCodePair("Hungarian","hu"));
        list.add(new NameCodePair("Kazakh","kk"));
        list.add(new NameCodePair("Kannada","kn"));
        list.add(new NameCodePair("Italian","it"));
        list.add(new NameCodePair("Irish","ga"));
        list.add(new NameCodePair("Indonesian","id"));
        list.add(new NameCodePair("Igbo","ig"));
        list.add(new NameCodePair("Icelandic","is"));
        list.add(new NameCodePair("Latvian","lv"));
        list.add(new NameCodePair("Latin","la"));
        list.add(new NameCodePair("Lao","lo"));
        list.add(new NameCodePair("Kyrgyz","ky"));
        list.add(new NameCodePair("Kurdish","ku"));
        list.add(new NameCodePair("Khmer","km"));
        list.add(new NameCodePair("Marathi","mr"));
        list.add(new NameCodePair("Maori","mi"));
        list.add(new NameCodePair("Maltese","mt"));
        list.add(new NameCodePair("Malayalam","ml"));
        list.add(new NameCodePair("Malagasy","mg"));
        list.add(new NameCodePair("Macedonian","mk"));
        list.add(new NameCodePair("Luxembourgish","lb"));
        list.add(new NameCodePair("Lithuanian","lt"));
        list.add(new NameCodePair("Punjabi","pa"));
        list.add(new NameCodePair("Persian","fa"));
        list.add(new NameCodePair("Pashto","ps"));
        list.add(new NameCodePair("Nyanja","ny"));
        list.add(new NameCodePair("Norwegian","no"));
        list.add(new NameCodePair("Nepali","ne"));
        list.add(new NameCodePair("Myanmar","my"));
        list.add(new NameCodePair("Mongolian","mn"));
        list.add(new NameCodePair("Somali","so"));
        list.add(new NameCodePair("Slovenian","sl"));
        list.add(new NameCodePair("Slovak","sk"));
        list.add(new NameCodePair("Sinhala","si"));
        list.add(new NameCodePair("Sindhi","sd"));
        list.add(new NameCodePair("Shona","sn"));
        list.add(new NameCodePair("Sesotho","st"));
        list.add(new NameCodePair("Serbian","sr"));
        list.add(new NameCodePair("Samoan","sm"));
        list.add(new NameCodePair("Romanian","ro"));
        list.add(new NameCodePair("Ukrainian","uk"));
        list.add(new NameCodePair("Turkish","tr"));
        list.add(new NameCodePair("Thai","th"));
        list.add(new NameCodePair("Tajik","tg"));
        list.add(new NameCodePair("Tagalog","tl"));
        list.add(new NameCodePair("Swedish","sv"));
        list.add(new NameCodePair("Swahili","sw"));
        list.add(new NameCodePair("Sundanese","su"));
        list.add(new NameCodePair("Zulu","zu"));
        list.add(new NameCodePair("Yoruba","yo"));
        list.add(new NameCodePair("Yiddish","yi"));
        list.add(new NameCodePair("Xhosa","xh"));
        list.add(new NameCodePair("Welsh","cy"));

        return list;
    }


    /**
     *   Inner Class for Language Name : Language Code
     *
     *   Example
     *
     *   "English","en"
     */
    public static class NameCodePair
    {
        public String name;
        public String code;

        public NameCodePair(String name, String code) {
            this.name = name;
            this.code = code;
        }

    }


    /**
     *   Inner Class for Language Name : Language Code : Language Index
     *
     *   Example
     *
     *   "English","en", 17
     */
    public static class NameCodeIndex
    {
        public String name;
        public String code;
        public int indexID;

        public NameCodeIndex(String name, String code, int indexID) {
            this.name = name;
            this.code = code;
            this.indexID=indexID;
        }

    }

}
