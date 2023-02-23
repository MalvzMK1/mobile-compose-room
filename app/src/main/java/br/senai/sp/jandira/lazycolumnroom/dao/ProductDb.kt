package br.senai.sp.jandira.lazycolumnroom.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.lazycolumnroom.model.Product

@Database(
  version = 1,
  entities = [Product::class]
)
abstract class ProductDb : RoomDatabase() {
  abstract fun productDao(): ProductDao

  companion object{
    private lateinit var instance: ProductDb

    fun getDatabase(context: Context): ProductDb {
      if (!::instance.isInitialized) {
        instance = Room
          .databaseBuilder(
            context,
            ProductDb::class.java ,
            "db_product"
          )
          .allowMainThreadQueries()
          .fallbackToDestructiveMigration()
          .build()
      }
      return instance
    }
  }

}
