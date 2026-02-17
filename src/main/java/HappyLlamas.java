
public class HappyLlamas {

    public boolean areTheLlamasHappy(boolean ultraBouncy, int trampolines) {
        // should return true if trampolines is between 24-42 INCLUSIVE!
        // only changes if trampolines are made of ultra-bouncy Nasa fabric:
        // if ultraBouncy is true, trampolines must be at LEAST 24, with no max value

        // @param ultraBouncy True if trampolines are made of UltraBouncy Nasa fabric
        // @param trampolines The number of trampolines
        // @return boolean indicating if the llamas are happy

        if (ultraBouncy) {
            return trampolines >= 24;
        }
        else {
            return trampolines >= 24 && trampolines <= 42;
        }
    }

}
