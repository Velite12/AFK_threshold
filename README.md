# AFK Threshold
Notify you either when a certain amount of time has passed or until you become idle, whichever comes last.

The goal of this plugin is to combine the Idle notifier and AFK plugins into one when doing skills which have variable
completion times such as mining and woodcutting. This will allow you to AFK for a certain period of time that you 
specify, but if you happen to not be idle, it will wait until you become idle to let you know. Thus, you can use as much
time as you want to be AFK if you don't actually need to do anything.

For instance, say you set the threshold to be AFK to 30 seconds. You mine something and are done in 15 seconds, and idle. The plugin would wait until 30 seconds, see you are idle and notify you. You then mine something else and it takes 45 seconds. The plugin checks at 30 seconds, sees you're still mining, and waits until you become idle to notify you, that way you always have a minimum time to AFK before receiving a notification, and if it takes longer you're only notified until you need to take action.

The motivation behind this plugin was to create a way to train skills which have variable completion time for actions (gathering skills) while focused on other tasks such as work or school, to match the AFKness of skills which have fixed completion times (most bankstanding skills). The existing plugins available did not meet the needs of this problem, so I created this one. The AFK Timer plugin does a better job than the Idle Notifier plugin, but I found that too often the regular interval checks meant I didn't need to actually do anything sometimes and I could have waited longer to respond.
