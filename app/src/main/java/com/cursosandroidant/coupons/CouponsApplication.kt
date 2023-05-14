package com.cursosandroidant.coupons

import android.app.Application
import androidx.room.Room
import com.cursosandroidant.coupons.common.dataAccess.CouponDatabase

/****
 * Project: Coupons
 * From: com.cursosandroidant.coupons
 * Created by Alain Nicolás Tello on 01/02/23 at 19:02
 * All rights reserved 2023.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * And Frogames formación:
 * https://cursos.frogamesformacion.com/pages/instructor-alain-nicolas
 *
 * Coupons on my Website:
 * www.alainnicolastello.com
 ***/
class CouponsApplication : Application(){
   companion object{
      lateinit var database: CouponDatabase
   }

   override fun onCreate() {
      super.onCreate()

      database = Room.databaseBuilder(this,
       CouponDatabase::class.java,
       "CouponDatabase")
       .build()
   }
}