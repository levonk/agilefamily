import com.google.auto.value.AutoValue;

@AutoValue
public abstract class UserStory
{
	public static UserStory create( Person owner, StoryStatus storyStatus, 
	public abstract Person getOwner();
	public abstract String getTitle();
	public abstract Moscow getMoscow();
	public abstract String getDescription();
	public abstract StoryStatus getStoryStatus();
	public abstract ZonedDateTime getCreateZonedDateTime();
	public abstract ZonedDateTime getModifyZonedDateTime();
	// organization
	// project
	// storyID

}
