package com.pmpavan.githubpullrequests.ui.util

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager


object UiUtils {

    fun hideKeyboard(activity: Activity) {
        hideKeyboard(activity, null)
    }

    fun hideKeyboard(activity: Activity, view: View?) {
        val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        var view = view
        if (view == null) {
            //Find the currently focused view, so we can grab the correct window token from it.
            view = activity.currentFocus
        }
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}