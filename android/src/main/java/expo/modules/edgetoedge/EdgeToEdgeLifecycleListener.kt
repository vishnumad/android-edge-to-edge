package expo.modules.edgetoedge

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.core.app.ComponentActivity
import androidx.core.view.WindowCompat
import expo.modules.core.interfaces.ReactActivityLifecycleListener

class EdgeToEdgeLifecycleListener : ReactActivityLifecycleListener {
    override fun onCreate(activity: Activity?, savedInstanceState: Bundle?) {
        if (activity != null && activity is ComponentActivity) {
            activity.setUpEdgeToEdge()
        }
    }
}