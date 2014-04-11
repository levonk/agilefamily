import com.google.auto.value.AutoValue;

@AutoValue
@ValueType
public abstract class UserStory
{
	// Don't permit Instantiation with
	@Constructor
	@PackageAccess
	UserStory() {};

	@FactoryMethod
	public static final @NonNull UserStory create()
	{
		final ZonedDateTime curTime = ZonedDateTime.now();
		return new AutoValue_UserStory(name, curTime, curTime);
	}

	@Accessor
	public abstract @NonNull Person getOwner();

	@Accessor
	public abstract @NonNull @NonEmpty String getTitle();

	@Accessor
	public abstract @NonNull Moscow getMoscow();

	@Accessor
	public abstract @NonNull @NonEmpty String getDescription();

	@Accessor
	public abstract @NonNull StoryStatus getStoryStatus();

	@Accessor
	public abstract @NonNull ZonedDateTime getCreateZonedDateTime();

	@Accessor
	public abstract @NonNull ZonedDateTime getModifyZonedDateTime();

	@Accessor
	public abstract @NonNull Ogranization getOrganization();

	@Accessor
	public abstract @NonNull Project getProject();

	@Accessor
	public abstract @NonNull StoryPK getStoryPK();
}
