package dji.sampleV5.aircraft

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.hardware.usb.UsbDevice
import android.hardware.usb.UsbManager
import android.util.Log

class UsbDebugReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.hardware.usb.action.USB_DEVICE_ATTACHED") {
            val device = intent.getParcelableExtra<UsbDevice>(UsbManager.EXTRA_DEVICE)
            if (device != null) {
                Log.e("USB_DEBUG", "USB device attached:")
                Log.e("USB_DEBUG", "Vendor ID: ${device.vendorId}")
                Log.e("USB_DEBUG", "Product ID: ${device.productId}")
                Log.e("USB_DEBUG", "Device Name: ${device.deviceName}")
                Log.e("USB_DEBUG", "Class: ${device.deviceClass}")
                Log.e("USB_DEBUG", "Subclass: ${device.deviceSubclass}")
            }
        }
    }
}