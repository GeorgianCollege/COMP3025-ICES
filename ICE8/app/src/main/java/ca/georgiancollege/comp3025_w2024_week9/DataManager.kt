package ca.georgiancollege.comp3025_w2024_week9

import android.content.Context
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

/**
 * The DataManager Class is a Singleton
 */
class DataManager private constructor()
{
    fun getTextFromResource(context: Context, resourceId: Int): String
    {
        return context.resources.openRawResource(resourceId)
            .bufferedReader()
            .use { it.readText()}
    }

    fun getTextFromAsset(context: Context, fileName: String): String
    {
        return context.resources.assets.open(fileName)
            .bufferedReader()
            .use { it.readText()}
    }

    fun deserializeJSON(context: Context): List<TVShow>?
    {
        val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
        val listType = Types.newParameterizedType(List::class.java, TVShow::class.java)
        val adapter: JsonAdapter<List<TVShow>> = moshi.adapter(listType)

        val contactListRawString = getTextFromResource(context, R.raw.tvshows)
        val contactList: List<TVShow>? = adapter.fromJson(contactListRawString)
        return contactList
    }

    companion object
    {
        val instance: DataManager by lazy { DataManager() }
    }
}