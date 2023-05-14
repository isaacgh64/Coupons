package com.cursosandroidant.coupons.common.dataAccess

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.cursosandroidant.coupons.common.entities.CouponEntity

/****
 * Project: Coupons
 * From: com.cursosandroidant.coupons.common.dataAccess
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
@Dao
interface CouponDao {
 @Query("SELECT * FROM CouponEntity WHERE code = :code")
   suspend fun consultCouponByCode(code: String): CouponEntity?

   @Insert
   suspend fun addCoupon(couponEntity: CouponEntity): Long
}