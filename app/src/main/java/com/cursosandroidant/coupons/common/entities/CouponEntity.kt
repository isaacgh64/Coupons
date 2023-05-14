package com.cursosandroidant.coupons.common.entities

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/****
 * Project: Coupons
 * From: com.cursosandroidant.coupons.common.entities
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
@Entity(tableName = "CouponEntity", indices = [Index(value = ["code"], unique = true)])
data class CouponEntity(@PrimaryKey(autoGenerate = true) var id: Long = 0,
                        var code: String = "",
                        var description: String = "",
                        var isActive: Boolean = true)
