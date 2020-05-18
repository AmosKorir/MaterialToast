package com.MaterialToast.lib

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.ShapeDrawable
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.MaterialToast.lib.R.color

/**
 * Created by Korir on 5/18/20.
 * amoskrr@gmail.com
 */
class MaterialToast {
  companion object {
    const val PRIMARY = 0
    const val WARNING = 1
    const val ERROR = 2
    const val DEFAULT = 3
    const val SUCCESS = 4
    const val SHORT = "short"
    const val LONG = "long"

    fun show(context: Context, mode: Int, message: String, type: String) {

      val shortOption = (type == SHORT)
      val longOption = (type == LONG)

      if (shortOption || longOption) {

        var length = Toast.LENGTH_SHORT

        if (shortOption) {
          length = Toast.LENGTH_SHORT
        }

        showToast(
          context,
          mode,
          message,
          length
        )
      } else {
        throw (Throwable("Use MaterialToast.SHORT or MaterialToast.LONG"))
      }
    }

    private fun showToast(context: Context, mode: Int, message: String, type: Int) {
      when (mode) {
        PRIMARY -> {
          customToast(context, message, color.primaryColor, type,R.drawable.ic_info_primary_24dp)
        }
        ERROR -> {
          customToast(context, message, color.errorColor, type,R.drawable.ic_error)
        }
        WARNING -> {
          customToast(context, message, color.warningColor, type,R.drawable.ic_warning_black_24dp)
        }
        SUCCESS -> {
          customToast(context, message, color.successColor, type,R.drawable.ic_check_success_24dp)
        }
        DEFAULT -> {
          defaultToast(context, message, type)
        }
        else -> {
          defaultToast(context, message, type)
        }
      }
    }

    private fun customToast(context: Context, message: String, color: Int, type: Int, icon: Int) {
      val toast: Toast = Toast.makeText(context, message, type)
      val view: View = toast.view

      when (val drawable = context.resources.getDrawable(R.drawable.material_toast_background)) {
        is ShapeDrawable -> {
          drawable.paint.color = ContextCompat.getColor(context, color)
          view.background = drawable
        }
        is GradientDrawable -> {
          drawable.setColor(ContextCompat.getColor(context, color))
          view.background = drawable
        }
        is ColorDrawable -> {
          drawable.color = ContextCompat.getColor(context, color)
          view.background = drawable
        }
      }
      val textView = view.findViewById(android.R.id.message) as TextView
      textView.setCompoundDrawablesWithIntrinsicBounds(icon, 0, 0, 0);
      toast.show()
    }

    private fun defaultToast(context: Context, message: String, type: Int) {
      Toast.makeText(context, message, type).show()
    }
  }
}