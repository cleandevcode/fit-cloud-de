package androidx.camera.extensions;

import androidx.camera.extensions.impl.InitializerImpl;
import p0.c;
import y.o;
import y.u0;

/* loaded from: classes.dex */
public final class ExtensionsManager {

    /* renamed from: a */
    public static final Object f1822a = new Object();

    /* renamed from: b */
    public static ExtensionsManager f1823b;

    /* renamed from: androidx.camera.extensions.ExtensionsManager$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements InitializerImpl.OnExtensionsInitializedCallback {
        public final /* synthetic */ o val$cameraProvider;
        public final /* synthetic */ c.a val$completer;

        public AnonymousClass1(c.a aVar, o oVar) {
            this.val$completer = aVar;
            this.val$cameraProvider = oVar;
        }

        public void onFailure(int i10) {
            ExtensionsManager extensionsManager;
            u0.b("ExtensionsManager", "Failed to initialize extensions");
            c.a aVar = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            synchronized (ExtensionsManager.f1822a) {
                extensionsManager = ExtensionsManager.f1823b;
                if (extensionsManager == null) {
                    extensionsManager = new ExtensionsManager();
                    ExtensionsManager.f1823b = extensionsManager;
                }
            }
            aVar.a(extensionsManager);
        }

        public void onSuccess() {
            ExtensionsManager extensionsManager;
            u0.a("ExtensionsManager", "Successfully initialized extensions");
            c.a aVar = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            synchronized (ExtensionsManager.f1822a) {
                extensionsManager = ExtensionsManager.f1823b;
                if (extensionsManager == null) {
                    extensionsManager = new ExtensionsManager();
                    ExtensionsManager.f1823b = extensionsManager;
                }
            }
            aVar.a(extensionsManager);
        }
    }

    /* renamed from: androidx.camera.extensions.ExtensionsManager$2 */
    /* loaded from: classes.dex */
    class AnonymousClass2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        public final /* synthetic */ c.a val$completer;

        public AnonymousClass2(c.a aVar) {
            ExtensionsManager.this = r1;
            this.val$completer = aVar;
        }

        public void onFailure(int i10) {
            this.val$completer.b(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.a(null);
        }
    }

    /* loaded from: classes.dex */
    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }
}
