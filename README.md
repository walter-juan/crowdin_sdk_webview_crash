Android demo project to show the Crowdin SDK crash with WebView component and HTML select.

Issue: https://github.com/crowdin/mobile-sdk-android/issues/194

# How to reproduce

1. Open the `MainApplication` and replace the `<distribution-hash>` with your Crowdin distribution hash.
2. Run the app
3. Click to "Load" button which will load the w3schools select tag example
4. Click to the select dropdown and the app will crash

The stack trace:

```
2021-09-20 09:29:14.811 20123-20123/com.example.crowdinwebview E/AndroidRuntime: FATAL EXCEPTION: main
    Process: com.example.crowdinwebview, PID: 20123
    android.content.res.Resources$NotFoundException: Resource ID #0x0
        at android.content.res.ResourcesImpl.getValue(ResourcesImpl.java:237)
        at android.content.res.Resources.loadXmlResourceParser(Resources.java:2281)
        at android.content.res.Resources.getLayout(Resources.java:1175)
        at android.view.LayoutInflater.inflate(LayoutInflater.java:532)
        at android.widget.ArrayAdapter.createViewFromResource(ArrayAdapter.java:428)
        at android.widget.ArrayAdapter.getView(ArrayAdapter.java:419)
        at Lf0.getView(chromium-TrichromeWebViewGoogle.aab-stable-457706231:2)
        at android.widget.AbsListView.obtainView(AbsListView.java:2405)
        at android.widget.ListView.measureHeightOfChildren(ListView.java:1421)
        at android.widget.ListView.onMeasure(ListView.java:1327)
        at android.view.View.measure(View.java:24530)
        at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6828)
        at android.widget.FrameLayout.onMeasure(FrameLayout.java:194)
        at android.view.View.measure(View.java:24530)
        at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6828)
        at android.widget.FrameLayout.onMeasure(FrameLayout.java:194)
        at android.view.View.measure(View.java:24530)
        at com.android.internal.widget.AlertDialogLayout.tryOnMeasure(AlertDialogLayout.java:146)
        at com.android.internal.widget.AlertDialogLayout.onMeasure(AlertDialogLayout.java:71)
        at android.view.View.measure(View.java:24530)
        at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6828)
        at android.widget.FrameLayout.onMeasure(FrameLayout.java:194)
        at android.view.View.measure(View.java:24530)
        at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6828)
        at android.widget.FrameLayout.onMeasure(FrameLayout.java:194)
        at android.view.View.measure(View.java:24530)
        at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6828)
        at android.widget.FrameLayout.onMeasure(FrameLayout.java:194)
        at com.android.internal.policy.DecorView.onMeasure(DecorView.java:742)
        at android.view.View.measure(View.java:24530)
        at android.view.ViewRootImpl.performMeasure(ViewRootImpl.java:3006)
        at android.view.ViewRootImpl.measureHierarchy(ViewRootImpl.java:1806)
        at android.view.ViewRootImpl.performTraversals(ViewRootImpl.java:2122)
        at android.view.ViewRootImpl.doTraversal(ViewRootImpl.java:1721)
        at android.view.ViewRootImpl$TraversalRunnable.run(ViewRootImpl.java:7598)
        at android.view.Choreographer$CallbackRecord.run(Choreographer.java:966)
        at android.view.Choreographer.doCallbacks(Choreographer.java:790)
        at android.view.Choreographer.doFrame(Choreographer.java:725)
        at android.view.Choreographer$FrameDisplayEventReceiver.run(Choreographer.java:951)
        at android.os.Handler.handleCallback(Handler.java:883)
        at android.os.Handler.dispatchMessage(Handler.java:100)
        at android.os.Looper.loop(Looper.java:214)
        at android.app.ActivityThread.main(ActivityThread.java:7356)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
```