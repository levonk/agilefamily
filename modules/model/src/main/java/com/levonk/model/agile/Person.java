import com.google.auto.value.AutoValue;

@AutoValue
@ValueType
public abstract class Person
{
	@Constructor
	@PackageAccess
	Person() {};

	@FactoryMethod
	public static final @NonNull Person create(final String name)
	{
		final ZonedDateTime curTime = ZonedDateTime.now();
		return new AutoValue_Person(name, curTime, curTime);
	}

	@Accessor
	public abstract @NonNull @NonEmpty String getName();

	@Accessor
	public abstract @NonNull ZonedDateTime getCreateDateTime();

	@Accessor
	public abstract @NonNull ZonedDateTime getModifyDateTime();

	@Accessor
	public abstract @NonNull PersonPK getPersonPK();
}
