import React from 'react';
import Card from './Card';

function ProfileCard(){
    return(
        <div>
            <Card title="JS Roe" backgroundColor="#820701">
                <p>하이욥 shifty입니다.</p>
                <p>리액트로 카드형 템플릿을 작성 중입니다.</p>
            </Card>
        </div>
    );
}

export default ProfileCard;