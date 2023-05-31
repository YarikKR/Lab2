package com.arm.malideveloper.openglessdk.rvd

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Manul(val name:String, val image:Int,val descr:String) : Parcelable
