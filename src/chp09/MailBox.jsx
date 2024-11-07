import React from "react";


function MailBox(props){
    const unreadMessages = props.unreadMessages;

    return(
        <div>
            <h1>안녕</h1>
            { unreadMessages.length > 0 &&
            <h2>
                메시지 {unreadMessages.length}개나 있는디 안 읽었음?
            </h2>
            }
        </div>
    );
}

export default MailBox;