package com.cursosandroidant.coupons.common.adapters

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.cursosandroidant.coupons.R

/****
 * Project: Coupons
 * From: com.cursosandroidant.coupons.common.adapters
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
     @BindingAdapter("isGone")
     fun bindIsGone(view: View, isGone: Boolean){
         view.visibility = if (isGone) View.GONE else View.VISIBLE
     }

    @BindingAdapter("textTitle")
    fun bindTextTitle(view: TextView, isActive: Boolean){
        if (isActive){
            view.setText(R.string.main_text_title)
            view.setTextColor(Color.BLACK)
        } else {
            view.setText(R.string.main_text_title_create)
            view.setTextColor(Color.MAGENTA)
        }
    }