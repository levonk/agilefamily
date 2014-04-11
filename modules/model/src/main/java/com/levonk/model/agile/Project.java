import com.google.auto.value.AutoValue;

@AutoValue
@ValueType
public abstract class Project
{
	// Don't permit Instantiation with
	@Constructor
	@PackageAccess
	Project() {};

	@FactoryMethod
	public static final @NonNull Project create()
	{
		final ZonedDateTime curTime = ZonedDateTime.now();
		return new AutoValue_Project(name, curTime, curTime);
	}

	@Accessor
	public abstract @NonNull Person getOwner();

	@Accessor
	public abstract @NonNull ZonedDateTime getCreateZonedDateTime();

	@Accessor
	public abstract @NonNull ZonedDateTime getModifyZonedDateTime();

	@Accessor
	public abstract @NonNull Ogranization getOrganization();

	@Accessor
	public abstract @NonNull ProjectPK getProjectPK();
}
