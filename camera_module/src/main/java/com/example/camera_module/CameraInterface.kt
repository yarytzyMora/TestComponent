package com.example.camera_module

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import androidx.camera.view.PreviewView

class CameraInterface : RelativeLayout {
    companion object{
        var viewFinder : PreviewView? = null
    }
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        val inflater =
            getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v: View = inflater.inflate(R.layout.camera_interface, this, true)
        viewFinder = v.findViewById<PreviewView>(R.id.viewFinder) as PreviewView

    }

}