public enum StoryStatus
{
	BACKLOG,
	GROOMING, // Flesh out story details
	SIZING, // Ready for people to estimate the story
	PLANNING, // Ready for Task break down
	LOADED, // Loaded into the current spring
	IN_PROGRESS, // Developer has attributed some time into it
	COMPLETE, // Developer has completed their work
	QA, // QA Review
	ACCEPTANCE, // Owner Acceptance
	DONE; // Owner Accepted


}
