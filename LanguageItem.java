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
     * Given the indexID get the Language Name e.x. "English"
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

}
