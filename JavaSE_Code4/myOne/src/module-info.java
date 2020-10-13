import com.litan_03.Impl.Czxy;
import com.litan_03.Impl.Litan;
import com.litan_03.MyService;

module myOne {
    exports com.litan_01;
    exports com.litan_03;

    provides MyService with Czxy;
}