package ln;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class x extends b {

    /* renamed from: k */
    public final Socket f20143k;

    public x(Socket socket) {
        this.f20143k = socket;
    }

    @Override // ln.b
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ln.b
    public final void k() {
        Level level;
        StringBuilder sb2;
        Logger logger;
        Exception exc;
        try {
            this.f20143k.close();
        } catch (AssertionError e10) {
            if (rm.l.l(e10)) {
                Logger logger2 = o.f20118a;
                level = Level.WARNING;
                sb2 = new StringBuilder();
                exc = e10;
                logger = logger2;
                sb2.append("Failed to close timed out socket ");
                sb2.append(this.f20143k);
                logger.log(level, sb2.toString(), (Throwable) exc);
            }
            throw e10;
        } catch (Exception e11) {
            Logger logger3 = o.f20118a;
            level = Level.WARNING;
            sb2 = new StringBuilder();
            exc = e11;
            logger = logger3;
            sb2.append("Failed to close timed out socket ");
            sb2.append(this.f20143k);
            logger.log(level, sb2.toString(), (Throwable) exc);
        }
    }
}
