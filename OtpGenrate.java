import java.util.stream.Stream;

public class OtpGenrator {
	public static Long generateOtp() {
		// 
		Object otpObject[] =Stream.generate(Math::random)
				.map(x -> x * (10000))
				.map(x -> Math.round(x))
				.filter(x -> x.intValue()>1000)
				.limit(1).toArray();
  
	return (Long) otpObject[0];
}
}
