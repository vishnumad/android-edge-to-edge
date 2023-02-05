package expo.modules.edgetoedge

import android.content.Context
import expo.modules.core.BasePackage
import expo.modules.core.interfaces.ReactActivityLifecycleListener

class EdgeToEdgePackage : BasePackage() {
    override fun createReactActivityLifecycleListeners(
        activityContext: Context?
    ): MutableList<ReactActivityLifecycleListener> {
        return mutableListOf(EdgeToEdgeLifecycleListener())
    }
}