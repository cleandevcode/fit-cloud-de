package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import lj.f;
import x0.m;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a */
    public final MediaControllerImplApi21 f655a;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: b */
    public final ConcurrentHashMap<a, Boolean> f656b = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 {

        /* renamed from: a */
        public final MediaController f657a;

        /* renamed from: b */
        public final Object f658b = new Object();

        /* renamed from: c */
        public final ArrayList f659c = new ArrayList();

        /* renamed from: d */
        public HashMap<a, a> f660d = new HashMap<>();

        /* renamed from: e */
        public final MediaSessionCompat.Token f661e;

        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            public WeakReference<MediaControllerImplApi21> f662a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f662a = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i10, Bundle bundle) {
                android.support.v4.media.session.b c0016a;
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f662a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f658b) {
                        MediaSessionCompat.Token token = mediaControllerImplApi21.f661e;
                        IBinder a10 = m.a(bundle, "android.support.v4.media.session.EXTRA_BINDER");
                        int i11 = b.a.f697a;
                        z2.d dVar = null;
                        if (a10 == null) {
                            c0016a = null;
                        } else {
                            IInterface queryLocalInterface = a10.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof android.support.v4.media.session.b)) {
                                c0016a = (android.support.v4.media.session.b) queryLocalInterface;
                            } else {
                                c0016a = new b.a.C0016a(a10);
                            }
                        }
                        synchronized (token.f673a) {
                            token.f675c = c0016a;
                        }
                        MediaSessionCompat.Token token2 = mediaControllerImplApi21.f661e;
                        try {
                            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(z2.a.class.getClassLoader());
                                Parcelable parcelable = bundle2.getParcelable("a");
                                if (parcelable instanceof ParcelImpl) {
                                    dVar = ((ParcelImpl) parcelable).f3475a;
                                } else {
                                    throw new IllegalArgumentException("Invalid parcel");
                                }
                            }
                        } catch (RuntimeException unused) {
                        }
                        synchronized (token2.f673a) {
                            token2.f676d = dVar;
                        }
                        mediaControllerImplApi21.a();
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class a extends a.c {
            public a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.a
            public final void Q(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void S() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void U(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void h(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void j(ArrayList arrayList) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void x0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f661e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f674b);
            this.f657a = mediaController;
            if (token.a() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        public final void a() {
            if (this.f661e.a() == null) {
                return;
            }
            Iterator it = this.f659c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                a aVar2 = new a(aVar);
                this.f660d.put(aVar, aVar2);
                aVar.f665c = aVar2;
                try {
                    this.f661e.a().a(aVar2);
                    aVar.c(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            this.f659c.clear();
        }

        public final void b(a aVar) {
            this.f657a.unregisterCallback(aVar.f663a);
            synchronized (this.f658b) {
                if (this.f661e.a() != null) {
                    try {
                        a remove = this.f660d.remove(aVar);
                        if (remove != null) {
                            aVar.f665c = null;
                            this.f661e.a().m(remove);
                        }
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e10);
                    }
                } else {
                    this.f659c.remove(aVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a */
        public final C0014a f663a = new C0014a(this);

        /* renamed from: b */
        public b f664b;

        /* renamed from: c */
        public MediaControllerImplApi21.a f665c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        /* loaded from: classes.dex */
        public static class C0014a extends MediaController.Callback {

            /* renamed from: a */
            public final WeakReference<a> f666a;

            public C0014a(a aVar) {
                this.f666a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.f666a.get() != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    int i10 = Build.VERSION.SDK_INT;
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.f666a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.f666a.get();
                if (aVar != null) {
                    aVar.a(MediaMetadataCompat.a(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.f666a.get();
                if (aVar == null || aVar.f665c != null) {
                    return;
                }
                aVar.b(PlaybackStateCompat.a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                MediaSessionCompat.QueueItem queueItem;
                if (this.f666a.get() != null && list != null) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (MediaSession.QueueItem queueItem2 : list) {
                        if (queueItem2 != null) {
                            MediaSession.QueueItem queueItem3 = queueItem2;
                            queueItem = new MediaSessionCompat.QueueItem(MediaDescriptionCompat.a(MediaSessionCompat.QueueItem.b.b(queueItem3)), MediaSessionCompat.QueueItem.b.c(queueItem3));
                        } else {
                            queueItem = null;
                        }
                        arrayList.add(queueItem);
                    }
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueTitleChanged(CharSequence charSequence) {
                this.f666a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionDestroyed() {
                this.f666a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.f666a.get();
            }
        }

        /* loaded from: classes.dex */
        public class b extends Handler {

            /* renamed from: a */
            public boolean f667a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Looper looper) {
                super(looper);
                a.this = r1;
                this.f667a = false;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                a aVar;
                if (this.f667a) {
                    switch (message.what) {
                        case 1:
                            MediaSessionCompat.a(message.getData());
                            aVar = a.this;
                            String str = (String) message.obj;
                            aVar.getClass();
                            return;
                        case 2:
                            a.this.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            a.this.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            aVar = a.this;
                            b bVar = (b) message.obj;
                            aVar.getClass();
                            return;
                        case 5:
                            aVar = a.this;
                            List list = (List) message.obj;
                            aVar.getClass();
                            return;
                        case 6:
                            aVar = a.this;
                            CharSequence charSequence = (CharSequence) message.obj;
                            aVar.getClass();
                            return;
                        case 7:
                            MediaSessionCompat.a((Bundle) message.obj);
                            a.this.getClass();
                            return;
                        case 8:
                        case 13:
                            a.this.getClass();
                            return;
                        case 9:
                        case 12:
                            aVar = a.this;
                            ((Integer) message.obj).intValue();
                            aVar.getClass();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            aVar = a.this;
                            ((Boolean) message.obj).booleanValue();
                            aVar.getClass();
                            return;
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class c extends a.AbstractBinderC0015a {

            /* renamed from: a */
            public final WeakReference<a> f669a;

            public c(a aVar) {
                this.f669a = new WeakReference<>(aVar);
            }
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void b(PlaybackStateCompat playbackStateCompat) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c(8, null, null);
        }

        public final void c(int i10, Object obj, Bundle bundle) {
            b bVar = this.f664b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i10, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public final void d(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.f664b = bVar;
                bVar.f667a = true;
                return;
            }
            b bVar2 = this.f664b;
            if (bVar2 != null) {
                bVar2.f667a = false;
                bVar2.removeCallbacksAndMessages(null);
                this.f664b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
            throw null;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f655a = new MediaControllerImplApi21(context, token);
    }

    public final PlaybackStateCompat a() {
        MediaControllerImplApi21 mediaControllerImplApi21 = this.f655a;
        if (mediaControllerImplApi21.f661e.a() != null) {
            try {
                return mediaControllerImplApi21.f661e.a().Y();
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e10);
            }
        }
        PlaybackState playbackState = mediaControllerImplApi21.f657a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.a(playbackState);
        }
        return null;
    }

    public final void b(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f656b.remove(fVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.f655a.b(fVar);
        } finally {
            fVar.d(null);
        }
    }
}
