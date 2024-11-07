import React from "react";

function UserStatus(props){
    return(
        <div>
            이 사용자는 현재 <b>{props.isLoggedIn ? "로그인" : "로그인 안 함"}</b>
        </div>
    )
}

export default UserStatus;