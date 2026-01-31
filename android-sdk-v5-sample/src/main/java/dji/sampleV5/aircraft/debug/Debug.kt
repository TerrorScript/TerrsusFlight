package dji.sampleV5.aircraft.debug

import android.util.Log

object Debug {
    const val TAG = "AIR3_DEBUG"

    fun log(message: String) {
        Log.i(TAG, message)
    }

    fun warn(message: String) {
        Log.w(TAG, message)
    }

    fun error(message: String) {
        Log.e(TAG, message)
    }
}