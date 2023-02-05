package expo.modules.edgetoedge

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import androidx.core.view.WindowCompat
import expo.modules.core.interfaces.ReactActivityLifecycleListener

class EdgeToEdgeLifecycleListener : ReactActivityLifecycleListener {
    override fun onCreate(activity: Activity?, savedInstanceState: Bundle?) {
        val reactActivity = requireNotNull(activity)
        WindowCompat.setDecorFitsSystemWindows(reactActivity.window, false)
        reactActivity.window.navigationBarColor = Color.TRANSPARENT
        reactActivity.window.isNavigationBarContrastEnforced = false
    }
}