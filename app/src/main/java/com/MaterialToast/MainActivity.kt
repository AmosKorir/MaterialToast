package com.MaterialToast

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.MaterialToast.lib.MaterialToast
import kotlinx.android.synthetic.main.activity_main.dangerBtn
import kotlinx.android.synthetic.main.activity_main.defaultBtn
import kotlinx.android.synthetic.main.activity_main.primaryBtn
import kotlinx.android.synthetic.main.activity_main.successBtn
import kotlinx.android.synthetic.main.activity_main.warningBtn

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    successBtn.setOnClickListener {
      MaterialToast.show(this, MaterialToast.SUCCESS, "success", MaterialToast.LONG)
    }

    dangerBtn.setOnClickListener {
      MaterialToast.show(this, MaterialToast.ERROR, "Error", MaterialToast.LONG)
    }

    primaryBtn.setOnClickListener {
      MaterialToast.show(this, MaterialToast.PRIMARY, "Primary", MaterialToast.LONG)
    }

    defaultBtn.setOnClickListener {
      MaterialToast.show(this, MaterialToast.DEFAULT, "Default", MaterialToast.LONG)
    }

    warningBtn.setOnClickListener {
      MaterialToast.show(this, MaterialToast.WARNING, "Warning", MaterialToast.LONG)
    }
  }
}
