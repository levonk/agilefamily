import com.google.auto.value.AutoValue;

@AutoValue
@ValueType
public abstract class Organization
{
	@Constructor
	@PackageAccess
	Organization() {};

	@FactoryMethod
	public static @NonNull Organization create(final String name)
	{
		final ZonedDateTime curTime = ZonedDateTime.now();
		return new AutoValue_Organization(name, curTime, curTime);
	}

	@Accessor
	public abstract @NonNull @NonEmpty String getName();

	@Accessor
	public abstract @NonNull ZonedDateTime getCreateDateTime();

	@Accessor
	public abstract @NonNull ZonedDateTime getModifyDateTime();

	@Accessor
	public abstract @NonNull OrganizationPK getOrginizationPK();
}
