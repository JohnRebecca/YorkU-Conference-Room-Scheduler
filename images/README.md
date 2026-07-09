# images/ folder

Place this folder next to wherever you run the app from (project root — the same
level as the `scheduler` source folder). Everything in here is optional: if a file
is missing, the app just skips the icon / falls back to a gray placeholder box.
Nothing will crash.

## Sidebar icons (~20x20 or larger, square works best)
- logo.png              -> top of sidebar, above "YorkU" (~40x40)
- icon_rooms.png         -> "Rooms" nav item
- icon_my_bookings.png   -> "My Bookings" nav item
- icon_check_in.png      -> "Check In" nav item
- icon_payment.png       -> "Payment" nav item
- icon_profile.png       -> "Profile" nav item

## Action icons (~16x16)
- icon_back.png    -> "Back to Rooms" button on the booking form
- icon_book.png    -> "Select Room" (Rooms page) and "Confirm Booking" (booking form) buttons

## Room photos
- rooms/placeholder.png   -> fallback thumbnail used for any room without its own photo (~220x140)
- rooms/DB-1001.png       -> photo for room DB-1001
- rooms/LAS-2045.png      -> photo for room LAS-2045
- rooms/VH-3002.png       -> photo for room VH-3002
- rooms/ACW-109.png       -> photo for room ACW-109

Room photo filenames must exactly match `Room.getRoomId()` (case-sensitive),
so if you add new rooms in code, add a matching `rooms/<ROOM_ID>.png`.
