import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Person
{
	public static Person()
	{
	}

	public abstract String getName();
	public abstract ZonedDateTime getCreateDateTime();
	public abstract ZonedDateTime getModifyDateTime();
	// PersonID
}
